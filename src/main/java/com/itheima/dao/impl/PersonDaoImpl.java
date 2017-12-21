package com.itheima.dao.impl;


import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.PersonDao;
import com.itheima.domain.Person;

import base.BaseDaoImpl;

@Repository("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{
//	@Resource(name="hibernateTemplate")
//	private HibernateTemplate hibernateTemplate;
////	
//	public void savePerson(Person person) {
//		this.hibernateTemplate.save(person);
//	}
	
}
