package com.itheima.service;

import java.util.Collection;

import com.itheima.domain.Privilege;
import com.itheima.domain.User;

import base.BaseService;

public interface PrivilegeService extends BaseService<Privilege>{

	Collection<Privilege> bulidPTreeByRid(Long rid);
	public Collection<Privilege> getFunctionByUid(User user);
	public Collection<Privilege> getMenuByUid(User user);

}
