package com.itheima.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.itheima.dao.RoleDao;
import com.itheima.domain.Role;

import base.BaseDaoImpl;
@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

	public Collection<Role> findRolesByUid(Long uid){
		/**
		 * 1、加载所有的角色
		 * 2、加载用户能够访问到的角色
		 * 3、遍历所有的角色，看allRoleList有那些角色是用户能访问到的角色userRoleList
		 */
		Collection<Role> allRoleList = this.hibernateTemplate.find("from Role");
		//用户所包含的角色
		Collection<Role> userRoleList = this.hibernateTemplate.find("from Role r inner join fetch r.users u where u.uid=?",uid);
 		
		for(Role role:allRoleList){
 			for(Role role2:userRoleList){
 				if(role.getRid().longValue()==role2.getRid().longValue()){
 					//将当前角色设置为 选中状态
 					role.setChecked(true);
 				}
 			}
 		}
		
		return allRoleList;
		
	}
}
