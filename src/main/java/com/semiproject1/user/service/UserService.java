package com.semiproject1.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.semiproject1.mapper.UserMapper;
import com.semiproject1.user.vo.UserVo;

@Transactional
@Service
public class UserService {
	
	UserMapper userMapper;
	
	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public List<UserVo> getUserList(){
		return userMapper.getUserList();
	}
	
	public int createUser(UserVo userVo) {		
		return userMapper.createUser(userVo);
	}
	
	public UserVo login(UserVo userVo){
		return userMapper.login(userVo);
	}
	
	public UserVo emailCheck(UserVo userVo) {
		return userMapper.emailCheck(userVo);
	}
	
}
