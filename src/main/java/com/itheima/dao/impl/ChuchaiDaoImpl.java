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

	@Override
	public Collection<Chuchaib> selfDaoxulistChuchai(String username) {
		System.err.println("user="+username);
		String sql = "from Chuchaib where username='"+username+"' order by jbsj desc";
		System.err.println("sql="+sql);
		return this.hibernateTemplate.find(sql);
	}

	@Override
	public Collection searchByWords(String searchWords) {
		return this.hibernateTemplate.find("from Chuchaib where dwmc like '%"+searchWords+"%' order by jbsj desc");
	}

	@Override
	public Collection searchByWords(String searchWords, String username) {
		return this.hibernateTemplate.find("from Chuchaib where dwmc like '%"+searchWords+"%' and username='"+username+"' order by jbsj desc");
	}
	
	
}
