package com.itheima.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima.dao.DepartmentDao;
import com.itheima.domain.Department;
import com.itheima.service.DepartmentService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;
	@Override
	public BaseDao<Department> getBaseDao() {
		return this.departmentDao;
	}

}
