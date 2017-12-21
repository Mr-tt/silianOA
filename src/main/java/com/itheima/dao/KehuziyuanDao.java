package com.itheima.dao;

import java.util.Collection;

import com.itheima.domain.Kehuziyuanb;

import base.BaseDao;

public interface KehuziyuanDao extends BaseDao<Kehuziyuanb>{

	Collection<Kehuziyuanb> daoxuList();

}
