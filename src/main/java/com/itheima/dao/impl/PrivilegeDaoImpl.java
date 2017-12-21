package com.itheima.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.itheima.dao.PrivilegeDao;
import com.itheima.domain.Privilege;
import com.itheima.domain.Role;
import com.itheima.domain.User;

import base.BaseDaoImpl;
@Repository("privilegeDao")
public class PrivilegeDaoImpl extends BaseDaoImpl<Privilege> implements PrivilegeDao{

	@Override
	public Collection<Privilege> bulidPTreeByRid(Long rid) {
		Collection<Privilege> allplist = this.hibernateTemplate.find("from Privilege");
		Collection<Privilege> roleHavePrivileg = this.hibernateTemplate.find("from Privilege p inner join fetch p.roles r where r.rid=?",rid);
		for(Privilege p : allplist){
			for(Privilege p1:roleHavePrivileg){
				if(p.getId().longValue()==p1.getId().longValue()){
					p.setChecked(true);
				}
			}
		}
		return allplist;
	}
	/**
	 * 查找为功能类型的权限
	 * @param user
	 * @return
	 */
	public Collection<Privilege> getFunctionByUid(User user){
		if(user.getUsername().equals("admin")){
			return this.hibernateTemplate.find("from Privilege p where p.type='2'");
		}else{			
			String s = "from Privilege p inner join fetch p.roles r inner join fetch r.users u where u.uid=? and p.type='2'";
			return this.hibernateTemplate.find(s,user.getUid());		
		}
	}
	
	
	/**
	 * 得到菜单型的权限
	 * @param user
	 * @return
	 */
	public Collection<Privilege> getMenuByUid(User user){
		if(user.getUsername().equals("admin")){
			return this.hibernateTemplate.find("from Privilege p where p.type=1");
		}else{
			String s = "from Privilege p inner join fetch p.roles r inner join fetch r.users u where u.uid=? and p.type=1";
			return this.hibernateTemplate.find(s,user.getUid());		
		}
	}
	
	
}
