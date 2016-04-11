package com.cn.Service;

import java.util.List;
import java.util.Map;

import com.cn.pojo.User;

public interface UserService {
	public List<User> getUser();
	
	public int insertUser(User user);
	
	public List<User> findBy(Map<String,Object> map);
	
	
	public int deletebyid(int id);

	
}
