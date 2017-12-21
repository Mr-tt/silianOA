package com.itheima.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Role;
import com.itheima.service.RoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import utils.OAUtils;
@Controller("roleAction")
@Scope("prototype")
public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	@Resource(name="roleService")
	private RoleService roleService;
	private Role role = new Role();
	private Long uid;
	private String checkedStr;
	
	public String getCheckedStr() {
		return checkedStr;
	}

	public void setCheckedStr(String checkedStr) {
		this.checkedStr = checkedStr;
	}


	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Role getModel() {
		return this.role;
	}
	
	//显示角色树
	public String showRoleTree() throws InterruptedException{
		Collection<Role> roles = this.roleService.findRolesByUid(uid);
		ActionContext.getContext().getValueStack().push(roles);
		return SUCCESS;
	}
	
	//跳转到listRole页面
	public String listRole(){
		Collection<Role> rolelist = this.roleService.queryEntity();		
		ActionContext.getContext().put("rolelist", rolelist);
		return "list";
	}
	
	//role_privilege传来 checkedStr 和 rid(用来建立role和privilege的关系)
	public String buildRoleAndPrivilege(){
		String[] ss = this.checkedStr.split(",");
		Long[] ids = OAUtils.converStringToLong(ss);//ids 为权限的id
		this.roleService.buildRoleAndPrivilege(ids,this.getModel().getRid());
		
		return SUCCESS;
	}

}
