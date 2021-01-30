package com.khacademy.project.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khacademy.project.entity.Notice;
import com.khacademy.project.service.NoticeService;

@WebServlet("/notice/list")
public class NoticeListController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String field_ = request.getParameter("f");
		String query_ = request.getParameter("q");
		String page_ = request.getParameter("p");
		
		String field = "title";// 기본값 (전달안됐을경우 null값 빈문자열)
		if(field_ != null && !field_.equals("")) {
			field = field_;
		}
		
		String query = "";// 기본값
		if(query_ != null && !query_.equals("")) {
			query = query_;
		}
		
		int page = 1;// 기본값
		if(page_ != null && !page_.equals("")) {
			page = Integer.parseInt(page_);
		}
		
		NoticeService service = new NoticeService();
		List<Notice> list = service.getNoticeList(field, query, page);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/WEB-INF/view/notice/list.jsp").forward(request, response);

	}

}
