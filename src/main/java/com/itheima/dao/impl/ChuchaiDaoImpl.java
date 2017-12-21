package com.itheima.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.itheima.dao.ChuchaiDao;
import com.itheima.domain.Chuchaib;

import base.BaseDaoImpl;
@Repository("chuchaiDao")
public class ChuchaiDaoImpl extends BaseDaoImpl<Chuchaib> implements ChuchaiDao{

	@Override
	public void add(Chuchaib cc) {
		
	}

	@Override
	public Collection<Chuchaib> daoxulistChuchai() {
		return this.hibernateTemplate.find("from Chuchaib order by jbsj desc");
	}
	
}
