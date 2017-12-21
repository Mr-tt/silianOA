package com.itheima.serviceImpl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.PrivilegeDao;
import com.itheima.domain.Privilege;
import com.itheima.domain.User;
import com.itheima.service.PrivilegeService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("privilegeService")
public class PrivilegeServiceImpl extends BaseServiceImpl<Privilege> implements PrivilegeService{
	@Resource(name="privilegeDao")
	private PrivilegeDao privilegeDao;
	@Override
	public BaseDao<Privilege> getBaseDao() {
		// TODO Auto-generated method stub
		return this.privilegeDao;
	}
	
	@Override
	public Collection<Privilege> bulidPTreeByRid(Long rid) {
		Collection<Privilege> c =this.privilegeDao.bulidPTreeByRid(rid);
		System.err.println(c.size()+"=================");
		return c;
	}
	//通过uid查询到 user有的权限
	public Collection<Privilege> getFunctionByUid(User user){
		return this.privilegeDao.getFunctionByUid(user);
	}
	public Collection<Privilege> getMenuByUid(User user){
		return this.privilegeDao.getMenuByUid(user);
	}
	
	

}
