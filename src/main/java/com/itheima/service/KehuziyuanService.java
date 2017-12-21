package com.itheima.service;

import java.util.Collection;

import com.itheima.domain.Kehuziyuanb;

import base.BaseService;

public interface KehuziyuanService extends BaseService<Kehuziyuanb>{
	Collection<Kehuziyuanb> daoxuList();
}
