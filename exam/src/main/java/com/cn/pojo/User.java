package com.cn.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import tk.mybatis.mapper.entity.IDynamicTableName;

@Table(name="user")
public class User implements IDynamicTableName{
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(generator = "JDBC")
	private int id;
	
	private String name;
	private String age;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public User(String name, String age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Transient
	private String dynamic;	
	
	
	public String getDynamic() {
		return dynamic;
	}
	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}
	public String getDynamicTableName() {
		return dynamic;
	}
	public String setDynamicTableName(String dynamicTableName) {
		return this.dynamic = dynamicTableName;
	}

}
