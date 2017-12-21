package test;

import java.util.Collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.action.PersonAction;
import com.itheima.dao.PersonDao;
import com.itheima.domain.Person;
import com.itheima.service.PersonService;

public class personTest {
	public ApplicationContext c = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	@Test
	public void test1(){
		PersonService ps = (PersonService) c.getBean("personService");
		Person person = new Person();
		person.setName("jack");
		person.setAge("2");
		ps.saveEntity(person);
	}
	
	@Test 
	public void testQuery(){
		PersonService ps = (PersonService) c.getBean("personService");
		Collection<Person> coll= ps.queryEntity();
		System.out.println(coll.size());
		//findById
//		Person p  = ps.findEntityById(1l);
//		System.err.println(p);
	}
	@Test 
	public void testPersonAction(){
		PersonAction personAction = (PersonAction) c.getBean("personAction");
		personAction.addUI();
		
	}
	
	
}
