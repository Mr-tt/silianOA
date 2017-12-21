package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringUtils {
	public static ApplicationContext c;
	static{
		 c = new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	}

}
