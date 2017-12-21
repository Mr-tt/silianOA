package com.itheima.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima.dao.DepartmentDao;
import com.itheima.domain.Department;

import base.BaseDaoImpl;
@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
