package test;

import org.hibernate.SessionFactory;
import org.junit.Test;

public class SessionFactoryTest extends SpringUtils{
	
	@Test
	public void test(){
		SessionFactory s = (SessionFactory) c.getBean("sessionFactory");
	}
	
}


