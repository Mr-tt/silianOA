package com.itheima.serviceImpl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.ChuchaiDao;
import com.itheima.domain.Chuchaib;
import com.itheima.service.ChuchaiService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("chuchaiService")
public class ChuchaiServiceImpl extends BaseServiceImpl<Chuchaib> implements ChuchaiService {
	@Resource(name="chuchaiDao")
	private ChuchaiDao chuchaiDao;
	
	
	@Override
	public BaseDao<Chuchaib> getBaseDao() {
		return this.chuchaiDao;
	}


	@Override
	public Collection<Chuchaib> daoxulistChuchai() {
		return this.chuchaiDao.daoxulistChuchai();
	}

}
