package com.itheima.serviceImpl;

import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.DepartmentDao;
import com.itheima.dao.RoleDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Department;
import com.itheima.domain.Role;
import com.itheima.domain.User;
import com.itheima.service.UserService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	
	@Resource(name="roleDao")
	private RoleDao roleDao;
 	
	@Override
	public BaseDao<User> getBaseDao() {
		return this.userDao;
	}
	@Transactional(readOnly=false)
	public void saveUser(User user,Long did,Long[] rids){
		Department d = this.departmentDao.findEntityById(did); 
		user.setDepartment(d);
		Set<Role> roles = this.roleDao.getEntrysByIds(rids);
		user.setRoles(roles);
		System.err.println(user);
		this.userDao.saveEntity(user);
	}
	
	@Transactional(readOnly=false)
	public void buildUserAndRole(Long uid,Long[] rids){
		Set<Role> roles = roleDao.getEntrysByIds(rids);
		User user = userDao.findEntityById(uid);
		user.setRoles(roles); //建立user role的关系
		userDao.updateEntity(user);
	}
}
