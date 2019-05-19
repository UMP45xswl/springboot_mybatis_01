package com.no1.cz.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import com.no1.cz.domain.User;

@Mapper
public interface UserMapper {
	
	@Insert(value = "insert into user(user_name, user_create_time) "
			      + "values(#{userName, jdbcType=VARCHAR}, #{userCreateTime, jdbcType=TIMESTAMP}) ")
	int insert(User user);
	
	@Update(value = "update user set user_name=#{userName, jdbcType=VARCHAR}, "
			      + "user_create_time=#{userCreateTime, jdbcType=TIMESTAMP} "
			      + "where user_id=#{userId, jdbcType=INTEGER}")
	int update(User user);
	
	

}
