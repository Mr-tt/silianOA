package com.itheima.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import base.BaseDao;
import base.BaseServiceImpl;

import com.itheima.dao.YijianDao;
import com.itheima.domain.Yijianb;
import com.itheima.service.YijianService;
@Service("yijianService")
public class YijianServiceImpl extends BaseServiceImpl<Yijianb> implements YijianService{
	@Resource(name="yijianDao")
	private YijianDao yijianDao;
	
	@Override
	public BaseDao<Yijianb> getBaseDao() {
		// TODO Auto-generated method stub
		return this.yijianDao;
	}

}
