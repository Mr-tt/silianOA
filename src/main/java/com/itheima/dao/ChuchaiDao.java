package com.itheima.dao;

import java.util.Collection;

import com.itheima.domain.Chuchaib;

import base.BaseDao;

public interface ChuchaiDao extends BaseDao<Chuchaib> {

	void add(Chuchaib cc);

	Collection<Chuchaib> daoxulistChuchai();

}
