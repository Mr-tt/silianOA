package com.itheima.service;

import com.itheima.domain.User;

import base.BaseService;

public interface UserService extends BaseService<User>{

	public void saveUser(User user,Long did,Long[] rids);

	public void buildUserAndRole(Long uid, Long[] rids);
}
