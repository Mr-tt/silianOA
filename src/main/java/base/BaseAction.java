package base;

import com.opensymphony.xwork2.ModelDriven;

public class BaseAction<T> implements ModelDriven<T>{
	private T t ;
	
	@Override
	public T getModel() {
		return this.t;
	}
	
}
