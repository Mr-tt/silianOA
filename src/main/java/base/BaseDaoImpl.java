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
	private Class entityClass; //实体bean(T)的class形式
	//持久化类的 标示符的名称
	private String identifierPropertyName;
	
	/**
	 * init方法由spring容器来调用
	 * @PostConstruct表示在调用构造方法之后来调用init方法
	 */
	@PostConstruct
	public void init(){
		/*
		 * 获取到实体bean的标示符的属性的名称
		 */
		this.identifierPropertyName = this.hibernateTemplate.getSessionFactory()
			.getClassMetadata(entityClass)
			.getIdentifierPropertyName();
	}
	
	public BaseDaoImpl() {
		//this.getClass().getGenericSuperclass = BaseDaoImpl()<T>     得到的是一个type类型  的泛型
		/**
		 * 如果该类被实例化，则this代表BaseDaoImpl的对象
		 *    this.getClass就是该对象的字节码的形式
		 *    this.getClass().getGenericSuperclass()代表该对象的父类即Object
		 *       所以这行代码得出的是一个Class而不是一个ParameterizedType
		 */
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		//得到泛型参数部分 --第0个参数T 
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
	 * 通过 id 的数组来查询 
	 * 返回一个Set<Role>
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
	 * 通过属性来查找对应的类
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
