package base;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

public abstract class BaseServiceImpl<T> implements BaseService<T> {
	//����һ�����󷽷���������ʵ��--
	public abstract BaseDao<T> getBaseDao();
	//�������
	@Transactional(readOnly=false)
	public void saveEntity(T t) {
		this.getBaseDao().saveEntity(t);
		
	}
	
	@Transactional(readOnly=false)
	public void deleteEntity(Serializable id) {
		this.getBaseDao().deleteEntity(id);
	}

	@Transactional(readOnly=false)
	public void updateEntity(T t) {
		this.getBaseDao().updateEntity(t);
	}

	@Override
	public Collection<T> queryEntity() {
		return this.getBaseDao().queryEntity();
	}

	@Override
	public T findEntityById(Serializable id) {
		return this.getBaseDao().findEntityById(id);
	}
	@Override
	public Set<T> getEntityByIds(Serializable[] ids) {
		// TODO Auto-generated method stub
		return this.getBaseDao().getEntrysByIds(ids);
				
	}
	
	

}
