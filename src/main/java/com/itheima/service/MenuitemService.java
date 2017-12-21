package com.itheima.service;

import java.util.Collection;

import com.itheima.domain.Menuitem;

import base.BaseService;

public interface MenuitemService extends BaseService<Menuitem>{
	public Collection<Menuitem> getMtreeByPId(Long id);
}
