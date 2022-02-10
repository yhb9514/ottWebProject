package com.semiproject1.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.semiproject1.mapper.UserMapper;
import com.semiproject1.user.service.UserService;
import com.semiproject1.user.vo.UserVo;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserMapper map;

	@Autowired
	UserService userService;

	@GetMapping("/userAll")
	public List<UserVo> userList() {

		return map.getUserList();
	}

	@PostMapping("/join")
	public int join(@RequestBody UserVo userVo) {
		return userService.createUser(userVo);
	}

//	@PostMapping("/test/{no}")
//	public String test(@PathVariable("no") int str) {
//		System.out.println(str);
//		return "test";
//	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Login(@RequestParam("email") String email, @RequestParam("pwd") String pwd) throws Exception {
		System.out.println(email);
		System.out.println(pwd);
		String path = "";

		UserVo userVo = new UserVo();

		userVo.setEmail(email);
		userVo.setPwd(pwd);

		UserVo result = null;
		result = userService.login(userVo);

		if (result != null) {
			path = "/profile";
		} else {
			path = "/";
		}

		return path;

	}
	
	@GetMapping("/emailCheck")
	public Boolean emailCheck(@RequestParam("email") String email) throws Exception {
		System.out.println(email);

		UserVo userVo = new UserVo();

		userVo.setEmail(email);

		UserVo result = null;
		result = userService.emailCheck(userVo);
		
		if(result != null) {
			return false;
		}
		return true;
	}

}
