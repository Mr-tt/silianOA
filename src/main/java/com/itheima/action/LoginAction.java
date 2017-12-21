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
	//ģ������
	private User user = new User() ;
	@Override
	public User getModel() {
		return this.user;
	}
	
	/**
	 * ��¼����
	 * @return
	 */
	public String login(){
		User user = this.loginService.login(this.getModel().getUsername(), this.getModel().getPassword());
		//Ȩ�޿��� ��user ��user�е�Ȩ��(privilege)  ����session���С�
		if(user==null){
			this.addActionError("�û���������������ˣ��ϸ磡");
			return "login";
		}else{																			//!!user ���ɵ�¼��һ���ҵ���
			Collection<Privilege> fprivileges = this.privilegeService.getFunctionByUid(user);
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			ServletActionContext.getRequest().getSession().setAttribute("fprivileges", fprivileges);
			return"index";
		}
	}
}
