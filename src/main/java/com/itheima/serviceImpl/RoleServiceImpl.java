package com.itheima.serviceImpl;

import java.util.Collection;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.PrivilegeDao;
import com.itheima.dao.RoleDao;
import com.itheima.domain.Privilege;
import com.itheima.domain.Role;
import com.itheima.service.RoleService;

import base.BaseDao;
import base.BaseServiceImpl;
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{
	@Resource(name="roleDao")
	private RoleDao roleDao;
	@Resource(name="privilegeDao")
	private PrivilegeDao privilegeDao;
	
	@Override
	public BaseDao<Role> getBaseDao() {
		// TODO Auto-generated method stub
		return this.roleDao;
	}

	@Override
	public Collection<Role> findRolesByUid(Long uid) {
		// TODO Auto-generated method stub
		return this.roleDao.findRolesByUid(uid);
	}
	
	/**
	 * 建立role和privilege的关系
	 */
	@Transactional(readOnly=false)
	public void buildRoleAndPrivilege(Long[] ids, Long rid) {
		Set<Privilege> privileges = this.privilegeDao.getEntrysByIds(ids);
		Role role = this.roleDao.findEntityById(rid);
		role.setPrivileges(privileges);
		this.roleDao.updateEntity(role);
	}

}
