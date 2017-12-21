package test;

import org.junit.Test;

import com.itheima.action.UserAction;
import com.itheima.dao.KehuziyuanDao;
import com.itheima.domain.Kehuziyuanb;
import com.itheima.service.UserService;

public class UserTest extends SpringUtils{
	@Test
	public void testUserService(){
//		UserService us = (UserService) c.getBean("userService");
//		us.queryEntity();
		KehuziyuanDao kd = (KehuziyuanDao) c.getBean("kehuziyuanDao");
		Kehuziyuanb k = new Kehuziyuanb();
		k.setDz("111");
		kd.saveEntity(k);
	}
	@Test
	public void testUserAction(){
		UserAction us = (UserAction) c.getBean("userAction");
		us.query();
	}
}
