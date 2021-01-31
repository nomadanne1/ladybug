package com.khacademy.project.controller.admin.notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khacademy.project.entity.Notice;
import com.khacademy.project.service.NoticeService;



@WebServlet("/admin/board/notice/reg")
public class RegController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title") ;
		String content = request.getParameter("content");
		String isOpen = request.getParameter("open");
		// open-> check�� �Ǹ� true check�� �ȵǸ� null�� 
		boolean pub = false;
		if(isOpen != null){
			pub=true;
		}

		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setPub(pub);
		
		// �������� ���߿� ó��������� �ϴ�..
		notice.setWriterId("jomelone");
		
		
		NoticeService service = new NoticeService();
		service.insertNotice(notice);
				
		response.sendRedirect("list");

	}
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(request, response);
	}

}
