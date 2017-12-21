package com.itheima.service;

import java.util.Collection;

import com.itheima.domain.Role;

import base.BaseService;

public interface RoleService extends BaseService<Role>{
	public Collection<Role> findRolesByUid(Long uid);

	public void buildRoleAndPrivilege(Long[] ids, Long rid);
}
