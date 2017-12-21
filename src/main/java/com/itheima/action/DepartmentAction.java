package com.itheima.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Department;
import com.itheima.service.DepartmentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import base.BaseAction;
@Controller("departmentAction")
@Scope("prototype")
public class DepartmentAction implements ModelDriven<Department>{
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	
	private Department d = new Department();
	
	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public Department getModel() {
		// TODO Auto-generated method stub
		return d;
	}
	
	
	public String list(){
		Collection<Department> dlist = this.departmentService.queryEntity();
		ActionContext.getContext().put("dlist", dlist);
		return "list";
	}
	
	public String addUI(){
		
		return "addUI";
	}
	
	public String add(){
		System.err.println("into addAction");
		Department d = new Department();
		BeanUtils.copyProperties(this.getModel(), d);
		System.err.println(d);
		this.departmentService.saveEntity(d);
		return "action2action";
	}
	
	public String delete(){
		this.departmentService.deleteEntity(this.getModel().getDid());
		return "action2action";
	}
	
	public String updateUI(){
		Department d = this.departmentService.findEntityById(this.getModel().getDid());
		ActionContext.getContext().getValueStack().push(d);
		return "updateUI";
	}
	
	public String update(){
		Department d = new Department();
		BeanUtils.copyProperties(this.getModel(), d);
		System.err.println(d);
		this.departmentService.updateEntity(d);
		return "action2action";
	}

	
}
