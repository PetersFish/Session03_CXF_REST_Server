package service.impl;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements IUserService{

	@Autowired
	UserMapper userMapper;

	@Override
	public User selectByPrimaryKey(Integer UID) {

		/*User user = new User();
		user.setUID(1);
		user.setUSERNAME("jack");*/

		return userMapper.selectByPrimaryKey(UID);
	}

	@Override
	public List<User> selectAll(Integer UID) {

		User user = new User();
		user.setUID(1);
		user.setUSERNAME("jack");

		List list = new ArrayList();
		list.add(user);
		return list;
	}


}
