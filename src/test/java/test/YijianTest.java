package test;

import org.junit.Test;

import com.itheima.dao.impl.YijianDaoImpl;
import com.itheima.domain.Yijianb;

public class YijianTest extends SpringUtils{
	
	@Test
	public void testAdd(){
		Yijianb yb = new Yijianb();
		yb.setYijian("222");
		System.err.println(yb.getYijian());
		YijianDaoImpl yjDao =  (YijianDaoImpl) c.getBean("yijianService");
		yjDao.saveEntity(yb);
	}
}
