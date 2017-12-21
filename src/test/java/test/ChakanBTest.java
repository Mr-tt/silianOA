package test;

import org.junit.Test;

import com.itheima.dao.ChakanDao;
import com.itheima.domain.Chakanb;
import com.itheima.service.ChakanService;

public class ChakanBTest extends SpringUtils{
	
	
	
	/*
	 * 测试插入查勘表，成功
	 */
	@Test
	public void chakanDaoTest(){
		
		ChakanService cd = (ChakanService) c.getBean("chakanService");
		Chakanb cb = new Chakanb();
		cb.setTbr("111t");
		cd.saveEntity(cb);
		
	}
	
	
	
	
	
	
	
}
