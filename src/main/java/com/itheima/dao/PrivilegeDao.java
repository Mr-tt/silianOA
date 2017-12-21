package com.itheima.dao;

import java.util.Collection;

import com.itheima.domain.Privilege;
import com.itheima.domain.User;

import base.BaseDao;

public interface PrivilegeDao extends BaseDao<Privilege>{

	Collection<Privilege> bulidPTreeByRid(Long rid);
	public Collection<Privilege> getFunctionByUid(User user);
	public Collection<Privilege> getMenuByUid(User user);
}
