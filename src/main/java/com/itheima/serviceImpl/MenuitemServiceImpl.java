package com.itheima.serviceImpl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.MenuitemDao;
import com.itheima.domain.Menuitem;
import com.itheima.service.MenuitemService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("menuitemService")
public class MenuitemServiceImpl extends BaseServiceImpl<Menuitem> implements MenuitemService{
	@Resource(name="menuitemDao")
	private MenuitemDao menuitemDao;
	@Override
	public BaseDao<Menuitem> getBaseDao() {
		// TODO Auto-generated method stub
		return this.menuitemDao;
	}
	
	@Override
	public Collection<Menuitem> getMtreeByPId(Long id) {
		// TODO Auto-generated method stub
		return this.menuitemDao.getMtreeByPId(id);
	}
	
}
