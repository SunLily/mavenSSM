package com.cn.Dao;

import java.util.List;
import java.util.Map;

import com.cn.pojo.User;

import tk.mybatis.mapper.common.Mapper;

public interface userDao extends Mapper<User>{
	
	public List<User> findBy(Map<String, Object> map);

}
