package com.itheima.dao;

import java.util.Collection;

import com.itheima.domain.Menuitem;

import base.BaseDao;

public interface MenuitemDao extends BaseDao<Menuitem>{
	public Collection<Menuitem> getMtreeByPId(Long id);
}
