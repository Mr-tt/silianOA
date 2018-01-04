package com.itheima.action;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.hibernate.usertype.UserVersionType;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima.domain.Chuchaib;
import com.itheima.domain.Department;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.ChuchaiService;
import com.itheima.service.DepartmentService;
import com.itheima.service.RoleService;
import com.itheima.service.UserService;
import com.itheima.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import privilege.annotation.PrivilegeInfo;
import utils.OAUtils;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	@Resource(name="roleService")
	private RoleService roleService;
	@Resource(name="chuchaiService")
	private ChuchaiService chuchaiService;
	
	private User user = new User();
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public User getModel() {
		return this.user;
	}
	// (��ѡ�н�ɫ��id���ַ�����ʽ)��������user��role�Ĺ�ϵ
	private String checkedStr;
	
	public String getCheckedStr() {
		return checkedStr;
	}
	public void setCheckedStr(String checkedStr) {
		this.checkedStr = checkedStr;
	}
	/**
	 * ������add.jsp�������� did rids  (�������� +ģ������)
	 */
	private Long did;
	private Long[] rids;
	
	
	public long getDid() {
		return did;
	}
	public void setDid(Long did) {
		this.did = did;
	}
	public Long[] getRids() {
		return rids;
	}
	public void setRids(Long[] rids) {
		this.rids = rids;
	}
	/**
	 * ��ѯ���е�user ���ص�list.jsp
	 * @return
	 */
	@PrivilegeInfo(name="�û���ѯ")
	public String query(){
		System.err.println("userAction�е�query����");
		Collection<User> userlist = this.userService.queryEntity();
		ActionContext.getContext().put("userlist", userlist);
		return "list";
	}
	
	public String addUI(){
		Collection<Department> dlist = this.departmentService.queryEntity();
		ActionContext.getContext().put("dlist", dlist);
		Collection<Role> rlist = this.roleService.queryEntity();
		ActionContext.getContext().put("rlist", rlist);
		return "addUI";
	}
	
	public String add() {
		User user = new User();
		//ģ�������ĸ�ֵ
		BeanUtils.copyProperties(this.getModel(), user);
		this.userService.saveUser(user, did, rids);
		return "action2action";
	}
	
	public String updateUI(){
		User user = this.userService.findEntityById(this.getModel().getUid());
		
		this.did = user.getDepartment().getDid();
//		Set<Role> roles = user.getRoles();
//		this.rids = new Long[roles.size()];
		this.rids = new Long[user.getRoles().size()];
		System.err.println(this.rids+"==========");
		int index = 0;
//		for (Role role : roles) {
		for (Role role : user.getRoles()) {
			this.rids[index] = role.getRid();
			index++;
		}
		//��user���뵽ֵջ�У����ڻ�������
		ActionContext.getContext().getValueStack().push(user);
		
		Collection<Department> dlist = this.departmentService.queryEntity();
		Collection<Role> rlist = this.roleService.queryEntity();
		ActionContext.getContext().put("dlist", dlist);
		ActionContext.getContext().put("rlist", rlist);
		return "updateUI";
	}
	
	public String update(){
		User user = new User();
		BeanUtils.copyProperties(this.getModel(), user);
		this.userService.updateEntity(user);
		this.userService.saveUser(user, did, rids);
		return "action2action";
	}
	
	public String delete(){
		this.userService.deleteEntity(this.getModel().getUid());
		return "action2action";
	}
	/**
	 * ��������������
	 * 1����ѡ�н�ɫ��id���ַ�����ʽ��checkedStr
	 * 2��uid 
	 * @return
	 */
	public String buildUserAndRole(){
		String[] strings = this.checkedStr.split(",");
		Long[] rids = OAUtils.converStringToLong(strings);
		this.userService.buildUserAndRole(this.getModel().getUid(),rids);
		return SUCCESS;
	}
	/**
	 * �˳���¼
	 * @return
	 */
	public String loginOut(){
		ServletActionContext.getRequest().getSession().invalidate();
		return "loginOut";
	}
	
	/**
	 * �������
	 * @return
	 */
	public String chuchai(){
		
		return "shenqing";
	}
	
	/**
	 * ��ת��ѡ�����������ҳ��
	 */
	
	public String shenpiUI(){
		System.err.println("11");
		return "selectShenpib";
	}
	
	/**
	 * ״̬��ѯ���鿴�û��Լ���д�ĳ����
	 * @return
	 */
	public String ztcx(){
		System.err.println("1");
		User u = (User) ActionContext.getContext().getSession().get("user");
		String username = u.getUsername();
		Collection<Chuchaib> ccs = this.chuchaiService.selfDaoxulistChuchai(username);
		ActionContext.getContext().put("ccs", ccs);
		return "listChuchaib";
	}
	
	
	
}
