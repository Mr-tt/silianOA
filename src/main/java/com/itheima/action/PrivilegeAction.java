package com.itheima.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Privilege;
import com.itheima.domain.User;
import com.itheima.service.PrivilegeService;
import com.itheima.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("privilegeAction")
public class PrivilegeAction extends ActionSupport implements ModelDriven<Privilege>{
	@Resource(name="privilegeService")
	private PrivilegeService privilegeService;
	@Resource(name="userService")
	private UserService userService;
	private Privilege privilege = new Privilege();
	private Long rid;
	private Long uid;
	
	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	@Override
	public Privilege getModel() {
		return null;
	}
	
	//加载权限树
	public String showPrivilegeTreeAction(){
		System.err.println("==================="+this.rid);
		Collection<Privilege> plist = this.privilegeService.bulidPTreeByRid(this.rid);
		System.err.println(plist.size());
		ActionContext.getContext().getValueStack().push(plist);
		
		return SUCCESS;
	}
	
	//通过uid来加载树，好控制左侧显示树
	public String showPrivilegeTreeByUid(){
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
//		System.err.println("showPrivilegeTreeByUid********"+user);
		Collection<Privilege> privileges = this.privilegeService.getMenuByUid(user);
		System.err.println(privileges.size()+"====showPrivilegeTreeByUid====");
		ActionContext.getContext().getValueStack().push(privileges);
		return SUCCESS;
	}

}
