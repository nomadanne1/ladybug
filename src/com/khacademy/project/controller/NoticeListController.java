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
		
		NoticeService service = new NoticeService();
		List<Notice> list = service.getNoticeList();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/ladybug/view/notice/list.jsp").forward(request, response);

	}

}
