package test;

import org.junit.Test;

import com.itheima.domain.Department;
import com.itheima.service.DepartmentService;

public class DepartmentTest extends SpringUtils{

	@Test
	public void testDService(){
		DepartmentService ds = (DepartmentService) c.getBean("departmentService");
		Department d = new Department();
		d.setName("���ز�");
		d.setDescription("��Ů��");
		ds.saveEntity(d);
	}
}
