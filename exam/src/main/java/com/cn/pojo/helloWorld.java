package com.cn.pojo;

import org.springframework.beans.factory.annotation.Required;

public class helloWorld {
	
	private String name;
	
	private User user;
	public User getUser() {
		return user;
	}
	
	@Required
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print(){
		System.out.println("spring :hello"+name);
	}
}
