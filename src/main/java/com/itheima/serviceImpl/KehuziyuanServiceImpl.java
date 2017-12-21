package com.itheima.serviceImpl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.KehuziyuanDao;
import com.itheima.domain.Kehuziyuanb;
import com.itheima.service.KehuziyuanService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("kehuziyuanService")
public class KehuziyuanServiceImpl extends BaseServiceImpl<Kehuziyuanb> implements KehuziyuanService{
	@Resource(name="kehuziyuanDao")
	private KehuziyuanDao kehuziyuanDao;
	@Override
	public BaseDao<Kehuziyuanb> getBaseDao() {
		return this.kehuziyuanDao;
	}
	
	public Collection<Kehuziyuanb> daoxuList(){
		
		
		
		
		return this.kehuziyuanDao.daoxuList();
	}
}
