package com.khacademy.project.controller.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.khacademy.project.domain.UserVO;
import com.khacademy.project.service.UserService;
import com.khacademy.project.service.impl.UserServiceImpl;


@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userservice = new UserServiceImpl();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/login/login.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			//아이디, 비밀번호값 저장 -로그인정보
			UserVO user = userservice.getLogin(request);
			
			//로그인 인증
			int result = userservice.login(user);
			HttpSession session = request.getSession();
			
			//로그인 성공 시에만  세션 저장
			if(result>0) {	
				user = userservice.Info(user);
				session.setAttribute("login", true);
				session.setAttribute("userInfo", user);
				request.getRequestDispatcher("/view/template/main.jsp").forward(request,response);
			}else {
				session.setAttribute("loginerror",true);
				request.getRequestDispatcher("/view/login/login.jsp").forward(request,response);
			}
			
		}
			
		
		
	
}
