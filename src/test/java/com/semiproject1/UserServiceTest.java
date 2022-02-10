//package com.semiproject1;
//
//import java.util.List;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.semiproject1.user.service.UserService;
//import com.semiproject1.user.vo.UserVo;
//
//@SpringBootTest
//public class UserServiceTest {
//
//	@Autowired
//	UserService userService;
//	
//	@Test
//	@DisplayName("전체조회")
//	void test1() {
//		List<UserVo> userList = userService.getUserList();
//		
//		for(UserVo vo : userList) {
//			System.out.println(vo.toString());
//		}
//	}
//	
//	@Test
//	@DisplayName("회원 추가")
//	void test2() {
//		UserVo userVo = new UserVo();
//		userVo.setEmail("han@gmail.com");
//		userVo.setPwd("han12345678!!");
//		userVo.setName("한상진");
//		userVo.setPhoneNumber("01012123434");
//		userVo.setBirthDate("2010-01-07");
//		
//		int insertCnt = userService.createUser(userVo);
//		if(insertCnt == 1) {
//			System.out.println(insertCnt + "회원 추가 성공");
//		}else {
//			System.out.println(insertCnt + "실패");
//		}
//		
//	}
//}
