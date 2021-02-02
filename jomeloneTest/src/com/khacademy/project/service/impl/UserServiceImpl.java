package com.khacademy.project.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.khacademy.project.dao.UserDAO;
import com.khacademy.project.dao.impl.UserDAOImpl;
import com.khacademy.project.domain.UserVO;
import com.khacademy.project.service.UserService;



public class UserServiceImpl implements UserService {

	private UserDAO udao = new UserDAOImpl(); 
	
	@Override
	public int joinUser(HttpServletRequest req) {
		
		UserVO user = new UserVO();
		
		user.setUserId(req.getParameter("userId"));
		user.setUserPw(req.getParameter("userPw"));
		user.setUserEmail(req.getParameter("userEmail"));
		user.setUserName(req.getParameter("userName"));
		user.setUserGender(req.getParameter("userGender"));
		user.setUserPhone(Integer.parseInt(req.getParameter("userPhone")));
		user.setUserBirth(req.getParameter("userBirth"));
		user.setUserPolicy(req.getParameter("userPolicy"));
		
		int result = udao.userInsert(user);
		
		return result;
		
	}

	@Override
	public UserVO getLogin(HttpServletRequest req) {
		
		UserVO user = new UserVO();
		
		user.setUserId(req.getParameter("userId"));
		user.setUserPw(req.getParameter("userPw"));
		
		return user;
	}

	@Override
	public int login(UserVO user) {
		return udao.selectUserCntByIdPw(user);
	}

	@Override
	public UserVO Info(UserVO user) {
		return udao.selectUserByUserId(user);
	}
	
	
}
