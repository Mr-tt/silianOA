package test;

import org.junit.Test;

import com.itheima.domain.User;
import com.itheima.service.LoginService;

public class LoginTest extends SpringUtils{

	
	@Test
	public void testLoginService(){
		LoginService ls = (LoginService) c.getBean("loginService");
		User u = ls.login("tom", "123");
		System.err.println(u.getUsername());
	}
}
