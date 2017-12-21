package com.itheima.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.LoginDao;
import com.itheima.domain.User;
import com.itheima.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	@Resource(name="loginDao")
	private LoginDao loginDao;
	
	public User login(String username,String password){
		Map<String, Object> map =new HashMap<String, Object>();
		map.put("username", username);
		map.put("password", password);
		return this.loginDao.queryEntityByProperty(map);

	}
	
}
