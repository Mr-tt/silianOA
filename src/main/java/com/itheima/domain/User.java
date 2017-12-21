package com.itheima.domain;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable{
	private Long uid;
	private String username;
	private String password;
	private String sex;
	private String phone;
	private String email;
	private Department department;
	private Set<Role> roles;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
//	@Override
//	public String toString() {
//		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", sex=" + sex + ", phone="
//				+ phone + ", email=" + email + ", department=" + department+"]";
//	}
}