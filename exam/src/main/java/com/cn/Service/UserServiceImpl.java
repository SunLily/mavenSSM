package com.cn.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;


import com.cn.Dao.userDao;
import com.cn.pojo.User;

@Service
public  class UserServiceImpl {


	
	@Resource
	private userDao mapper;
	
	public List<User> getUser() {
		return this.mapper.selectAll();
	}

	public int insertUser(User user) {
		return this.mapper.insert(user);
	}

	public List<User> findBy(Map<String, Object> map) {
		
		Example example = new Example(User.class);
		
		Criteria criteria = example.createCriteria();
		
		
		Iterator<Entry<String, Object>> iter = map.entrySet().iterator();
		
		
		while(iter.hasNext()){
			Entry<String, Object> entry = iter.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			criteria.andCondition(key+" like '"+value+"'");
		}
		return mapper.selectByExample(example);
	}

	public int deletebyid(int id) {
		return mapper.deleteByPrimaryKey(id);
	}

	

}
