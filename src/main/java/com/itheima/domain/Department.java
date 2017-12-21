package com.itheima.domain;

import java.io.Serializable;
import java.util.Set;

public class Department implements Serializable{
	private long did;
	private String name;
	private String description;
	private Set<User> users;
	
	
	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", description=" + description + ", users=" + users + "]";
	}
	
	public long getDid() {
		return did;
	}
	public void setDid(long did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	

	
}
