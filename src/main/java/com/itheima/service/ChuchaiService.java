package com.itheima.service;

import java.util.Collection;

import com.itheima.domain.Chuchaib;

import base.BaseService;

public interface ChuchaiService extends BaseService<Chuchaib>{

	Collection<Chuchaib> daoxulistChuchai();
	
	Collection<Chuchaib> selfDaoxulistChuchai(String username);

	Collection searchByWords(String searchWords);

	Collection searchByWords(String searchWords, String username);

}
