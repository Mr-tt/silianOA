package base;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface BaseDao<T> {
	public void saveEntity(T t);
	public void deleteEntity(Serializable id);
	public void updateEntity(T t);
	public Collection<T> queryEntity();
	public T findEntityById(Serializable id);
	public Set<T> getEntrysByIds(Serializable[] ids);
	public T queryEntityByProperty(final Map<String, Object> map);
	
}
