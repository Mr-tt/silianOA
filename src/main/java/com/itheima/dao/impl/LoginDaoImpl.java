package com.itheima.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima.dao.LoginDao;
import com.itheima.domain.User;

import base.BaseDaoImpl;
@Repository("loginDao")
public class LoginDaoImpl extends BaseDaoImpl<User> implements LoginDao{

}
