package com.itheima.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.PersonDao;
import com.itheima.domain.Person;
import com.itheima.service.PersonService;

import base.BaseDao;
import base.BaseServiceImpl;

@Service("personService")
public class PersonServiceImpl extends BaseServiceImpl<Person> implements PersonService{
	@Resource(name="personDao")
	private PersonDao personDao;
	
	@Override
	public BaseDao<Person> getBaseDao() {
		// TODO Auto-generated method stub
		return this.personDao;
	}
	
//	@Transactional(readOnly=false)
//	public void savePerson(Person person){
//		this.personDao.saveEntity(person);
//	}

}
