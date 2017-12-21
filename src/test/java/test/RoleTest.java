package test;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.itheima.domain.Role;
import com.itheima.service.RoleService;


public class RoleTest extends SpringUtils{
	@Test
	public void testSaveRole(){
		RoleService roleService = (RoleService)c.getBean("roleService");
		SessionFactory sessionFactory = (SessionFactory)c.getBean("sessionFactory");
		Session session = sessionFactory.openSession();
		/**
		 * 用户角色、岗位角色、部门角色
		 */
		Role role1 = new Role();
		role1.setName("用户角色");
		role1.setDescription("拥有用户模块的crud的操作");
		
		
		Role role2 = new Role();
		role2.setName("部门角色");
		role2.setDescription("拥有部门模块的crud的操作");
		
		
		Role role3 = new Role();
		role3.setName("岗位角色");
		role3.setDescription("拥有岗位模块的crud的操作");
		
		roleService.saveEntity(role1);
		roleService.saveEntity(role2);
		roleService.saveEntity(role3);
		
	}
}
