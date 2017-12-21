package com.itheima.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.itheima.dao.MenuitemDao;
import com.itheima.domain.Menuitem;

import base.BaseDaoImpl;
@Repository("menuitemDao")
public class MenuitemDaoImpl extends BaseDaoImpl<Menuitem> implements MenuitemDao{
	
	
	public Collection<Menuitem> getMtreeByPId(Long id){
		
		return this.hibernateTemplate.find("from Menuitem where pid=?", id);
	};
}
