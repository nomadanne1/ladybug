package com.khacademy.project.controller.join;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khacademy.project.service.UserService;
import com.khacademy.project.service.impl.UserServiceImpl;



@WebServlet("/join.do")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService = new UserServiceImpl();
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/join/join.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		//회원가입
		int result = userService.joinUser(request);
		
		//회원가입성공
		if(result>0) {
			response.sendRedirect("main.do");
		}else {
			PrintWriter out = response.getWriter();
			out.println("회원가입 실패");
		}
		
	}

}
