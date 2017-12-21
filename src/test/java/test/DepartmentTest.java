package test;

import org.junit.Test;

import com.itheima.domain.Department;
import com.itheima.service.DepartmentService;

public class DepartmentTest extends SpringUtils{

	@Test
	public void testDService(){
		DepartmentService ds = (DepartmentService) c.getBean("departmentService");
		Department d = new Department();
		d.setName("公关部");
		d.setDescription("美女多");
		ds.saveEntity(d);
	}
}
