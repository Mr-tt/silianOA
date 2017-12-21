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
		 * 1���������еĽ�ɫ
		 * 2�������û��ܹ����ʵ��Ľ�ɫ
		 * 3���������еĽ�ɫ����allRoleList����Щ��ɫ���û��ܷ��ʵ��Ľ�ɫuserRoleList
		 */
		Collection<Role> allRoleList = this.hibernateTemplate.find("from Role");
		//�û��������Ľ�ɫ
		Collection<Role> userRoleList = this.hibernateTemplate.find("from Role r inner join fetch r.users u where u.uid=?",uid);
 		
		for(Role role:allRoleList){
 			for(Role role2:userRoleList){
 				if(role.getRid().longValue()==role2.getRid().longValue()){
 					//����ǰ��ɫ����Ϊ ѡ��״̬
 					role.setChecked(true);
 				}
 			}
 		}
		
		return allRoleList;
		
	}
}
