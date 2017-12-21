package test;

import java.util.Collection;

import org.junit.Test;

import com.itheima.dao.KehuziyuanDao;
import com.itheima.domain.Kehuziyuanb;
import com.itheima.service.KehuziyuanService;

public class KehuziyuanTest extends SpringUtils{
	@Test
	public void test_KehuziyuanDao(){
		KehuziyuanDao kd = (KehuziyuanDao) c.getBean("kehuziyuanDao");
		Kehuziyuanb k = new Kehuziyuanb();
		k.setDz("111");
		kd.saveEntity(k);
	}
	@Test
	public void test_KehuziyuanService(){
		KehuziyuanService kd = (KehuziyuanService) c.getBean("kehuziyuanService");
		Kehuziyuanb k = new Kehuziyuanb();
		k.setDz("111");
		kd.saveEntity(k);
	}
	
	@Test
	public void test_daoxuList(){
		KehuziyuanService kd = (KehuziyuanService) c.getBean("kehuziyuanService");
		Collection<Kehuziyuanb> cs = kd.daoxuList();//
		System.err.println(cs.size());
		System.err.println(cs.toString());
	}
	
	@Test
	public void test(){
		String s = "C:\\Program Files (x86)\\Apache Software Foundation";
		String[] ss = s.split("\\\\");
		for(int i=0;i<ss.length;i++){
			System.err.println(ss[i]);
		}
	}
	
}
