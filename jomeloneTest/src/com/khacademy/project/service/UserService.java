package com.khacademy.project.service;

import javax.servlet.http.HttpServletRequest;

import com.khacademy.project.domain.UserVO;

public interface UserService {
	
	//회원가입 
	int joinUser (HttpServletRequest req);
	
	//로그인 정보(아이디, 비밀번호 ) 저장
	UserVO getLogin (HttpServletRequest req); 
	
	//로그인 시도
	int login(UserVO user);
	
	//로그인 성공한 유저 정보 가져오기
	UserVO Info(UserVO user);
}
