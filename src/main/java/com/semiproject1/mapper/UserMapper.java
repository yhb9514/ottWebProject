package com.semiproject1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.semiproject1.user.vo.UserVo;

@Mapper
public interface UserMapper {

	@Select("select email from member")
	public List<UserVo> getUserList();

	
	//public int createUser(UserVo userVo);
	
	@Insert("insert into member values(#{in.email}, #{in.pwd}, #{in.name}, #{in.phoneNumber}, #{in.birthDate})")
	public int createUser(@Param("in") UserVo userVo);
	
	@Select("select * from member where email = #{userVo.email} and pwd = #{userVo.pwd}")
	public UserVo login(@Param("userVo") UserVo userVo);
	
	@Select("select email from member where email = #{check.email}")
	public UserVo emailCheck(@Param("check") UserVo userVo);
	
}
