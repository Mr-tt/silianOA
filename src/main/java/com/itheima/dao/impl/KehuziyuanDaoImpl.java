package com.itheima.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.itheima.dao.KehuziyuanDao;
import com.itheima.domain.Kehuziyuanb;

import base.BaseDaoImpl;
@Repository("kehuziyuanDao")
public class KehuziyuanDaoImpl extends BaseDaoImpl<Kehuziyuanb> implements KehuziyuanDao{

	@Override
	public Collection<Kehuziyuanb> daoxuList() {
		return this.hibernateTemplate.find("from Kehuziyuanb order by tbrq desc");
	}
	
}
