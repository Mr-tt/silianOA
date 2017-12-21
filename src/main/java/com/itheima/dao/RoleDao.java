package com.itheima.dao;

import java.util.Collection;

import com.itheima.domain.Role;

import base.BaseDao;

public interface RoleDao extends BaseDao<Role>{
	public Collection<Role> findRolesByUid(Long uid);
}
