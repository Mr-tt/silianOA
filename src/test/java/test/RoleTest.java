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
		 * �û���ɫ����λ��ɫ�����Ž�ɫ
		 */
		Role role1 = new Role();
		role1.setName("�û���ɫ");
		role1.setDescription("ӵ���û�ģ���crud�Ĳ���");
		
		
		Role role2 = new Role();
		role2.setName("���Ž�ɫ");
		role2.setDescription("ӵ�в���ģ���crud�Ĳ���");
		
		
		Role role3 = new Role();
		role3.setName("��λ��ɫ");
		role3.setDescription("ӵ�и�λģ���crud�Ĳ���");
		
		roleService.saveEntity(role1);
		roleService.saveEntity(role2);
		roleService.saveEntity(role3);
		
	}
}
