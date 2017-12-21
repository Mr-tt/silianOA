package com.itheima.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import base.BaseDaoImpl;
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
