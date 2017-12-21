package base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class BaseDaoImpl<T> implements BaseDao<T> {
	@Resource(name="hibernateTemplate")
	public HibernateTemplate hibernateTemplate;
	private Class entityClass; //ʵ��bean(T)��class��ʽ
	//�־û���� ��ʾ��������
	private String identifierPropertyName;
	
	/**
	 * init������spring����������
	 * @PostConstruct��ʾ�ڵ��ù��췽��֮��������init����
	 */
	@PostConstruct
	public void init(){
		/*
		 * ��ȡ��ʵ��bean�ı�ʾ�������Ե�����
		 */
		this.identifierPropertyName = this.hibernateTemplate.getSessionFactory()
			.getClassMetadata(entityClass)
			.getIdentifierPropertyName();
	}
	
	public BaseDaoImpl() {
		//this.getClass().getGenericSuperclass = BaseDaoImpl()<T>     �õ�����һ��type����  �ķ���
		/**
		 * ������౻ʵ��������this����BaseDaoImpl�Ķ���
		 *    this.getClass���Ǹö�����ֽ������ʽ
		 *    this.getClass().getGenericSuperclass()����ö���ĸ��༴Object
		 *       �������д���ó�����һ��Class������һ��ParameterizedType
		 */
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		//�õ����Ͳ������� --��0������T 
		this.entityClass  = (Class) type.getActualTypeArguments()[0];
		System.err.println(type.getRawType());// rawType = BaseDaoImpl
	}

	@Override
	public void saveEntity(T t) {
		this.hibernateTemplate.save(t);
	}

	@Override
	public void deleteEntity(Serializable id) {
		// TODO Auto-generated method stub
		T t = (T) this.hibernateTemplate.get(this.entityClass, id);
		this.hibernateTemplate.delete(t);
	}

	@Override
	public void updateEntity(T t) {
		// TODO Auto-generated method stub
		this.hibernateTemplate.update(t);
	}

	@Override
	public Collection<T> queryEntity() {
//		return this.hibernateTemplate.find("from"+this.entityClass.getName());
		System.err.println(this.entityClass.getName());
		return this.hibernateTemplate.find("from "+this.entityClass.getName());
	}

	@Override
	public T findEntityById(Serializable id) {
		// TODO Auto-generated method stub
		System.out.println(this.entityClass);
		return (T) this.hibernateTemplate.get(this.entityClass, id);
	}
	
	/**
	 * ͨ�� id ����������ѯ 
	 * ����һ��Set<Role>
	 */
	@Override
	public Set<T> getEntrysByIds(Serializable[] ids){
		StringBuffer buffer = new StringBuffer();
		buffer.append("from "+this.entityClass.getName());
		buffer.append(" where "+this.identifierPropertyName+" in("); //identifierPropertyName = rid 
		for(int i=0;i<ids.length;i++){
			if(i==ids.length-1){
				buffer.append(ids[i]);
			}else{
				buffer.append(ids[i]+",");
			}
		}
		buffer.append(")");
		System.err.println(buffer.toString()); // buffer  = from com.itheima.domain.Role where rid in(1,2)
		return new HashSet<T>(this.hibernateTemplate.find(buffer.toString()));
	}
	/**
	 * ͨ�����������Ҷ�Ӧ����
	 */
	public T queryEntityByProperty(final Map<String, Object> map){
		final StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("from "+this.entityClass.getName());
		stringBuffer.append(" where 1=1");
		for(Entry<String, Object> entry:map.entrySet()){
			stringBuffer.append(" and "+entry.getKey()+"=:"+entry.getKey());
		}
		System.err.println(stringBuffer.toString());
		return this.hibernateTemplate.execute(new HibernateCallback<T>(){
			@Override
			public T doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery(stringBuffer.toString());
				for(Entry<String, Object> entry: map.entrySet()){
					query.setParameter(entry.getKey(), entry.getValue());
				}
				return (T) query.uniqueResult();
			}
			
			
		});
		
		
	} 
	
	
	
	
	

}
