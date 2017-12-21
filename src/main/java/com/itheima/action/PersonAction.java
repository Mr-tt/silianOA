package com.itheima.action;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Person;
import com.itheima.service.PersonService;
import com.opensymphony.xwork2.ActionContext;

import base.BaseAction;
@Controller("personAction")
public class PersonAction extends BaseAction<Person>{
	@Resource(name="personService")
	private PersonService personService; 
	
	public String addUI(){
//		Person person = new Person();
//		BeanUtils.copyProperties(this.getModel(), person);	//将从模型驱动获得的对象拷贝到 person中来
//		this.personService.saveEntity(this.getModel());
		return "addUI";
	}
	
	public String show(){
		ArrayList<Person> personList = (ArrayList<Person>) this.personService.queryEntity();
		ActionContext.getContext().put("personList", personList);
		return "list";
	}
	
}
