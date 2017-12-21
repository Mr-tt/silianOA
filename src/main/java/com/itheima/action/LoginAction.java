package com.itheima.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Privilege;
import com.itheima.domain.User;
import com.itheima.service.LoginService;
import com.itheima.service.PrivilegeService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
@Controller("loginAction")
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	@Resource(name="loginService")
	private LoginService loginService;
	@Resource(name="privilegeService")
	private PrivilegeService privilegeService;
	//模型驱动
	private User user = new User() ;
	@Override
	public User getModel() {
		return this.user;
	}
	
	/**
	 * 登录功能
	 * @return
	 */
	public String login(){
		User user = this.loginService.login(this.getModel().getUsername(), this.getModel().getPassword());
		//权限控制 将user 和user有的权限(privilege)  放入session域中。
		if(user==null){
			this.addActionError("用户名或者密码错误了，老哥！");
			return "login";
		}else{																			//!!user 是由登录第一行找到的
			Collection<Privilege> fprivileges = this.privilegeService.getFunctionByUid(user);
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			ServletActionContext.getRequest().getSession().setAttribute("fprivileges", fprivileges);
			return"index";
		}
	}
}
