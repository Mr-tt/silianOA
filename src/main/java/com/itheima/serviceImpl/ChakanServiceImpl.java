package com.itheima.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.ChakanDao;
import com.itheima.domain.Chakanb;
import com.itheima.service.ChakanService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("chakanService")
public class ChakanServiceImpl extends BaseServiceImpl<Chakanb> implements ChakanService{
	@Resource(name="chakanDao")
	private ChakanDao chakanDao;
	
	@Override
	public BaseDao<Chakanb> getBaseDao() {
		return this.chakanDao;
	}

}
