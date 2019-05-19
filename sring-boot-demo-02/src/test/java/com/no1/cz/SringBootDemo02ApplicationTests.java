package com.no1.cz;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.no1.cz.domain.User;
import com.no1.cz.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SringBootDemo02ApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void userInsert() {
		User user = new User();
		user.setUserName("huhao");
		user.setUserCreateTime(new Date());
		this.userMapper.insert(user);
	}
	
	@Test
	public void userUpdate() {
		User user = new User();
		user.setUserId(3);
		user.setUserName("Albert");
		user.setUserCreateTime(new Date());
		this.userMapper.update(user);
	}
	
	


}
