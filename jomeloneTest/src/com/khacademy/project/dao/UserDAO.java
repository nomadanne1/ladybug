package com.khacademy.project.dao;

import com.khacademy.project.domain.UserVO;

public interface UserDAO {
	
	//회원가입
	int userInsert(UserVO user);

	//아이디와 비밀본호 정보로 회원정보 찾기(count(*))
	int selectUserCntByIdPw(UserVO user);
	
	//아이디값으로 회원정보불러오기
	UserVO selectUserByUserId(UserVO user);
	
}
