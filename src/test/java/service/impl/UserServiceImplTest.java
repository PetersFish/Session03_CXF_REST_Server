package service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.User;
import service.IUserService;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
public class UserServiceImplTest {

	@Autowired
			@Qualifier("userService")
	IUserService userService;

	@Test
	public void selectByPrimaryKey() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getUSERNAME());
	}
}