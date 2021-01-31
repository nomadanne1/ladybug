package com.khacademy.project.controller.admin.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khacademy.project.entity.Notice;
import com.khacademy.project.service.NoticeService;



@WebServlet("/admin/board/notice/list")
public class ListController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//checkbox에 체크한 값의 id전달받음
		String[] openIds = request.getParameterValues("open-id");
		String[] delIds = request.getParameterValues("del-id");
		
		String cmd = request.getParameter("cmd");
		
		switch(cmd) {
		case "일괄공개":
			for(String openId : openIds) {
				System.out.printf("open id : %s\n", openId );
			}
			break;
		case "일괄삭제":
			NoticeService service = new NoticeService();
			
			// string-> int
			int[] ids = new int [delIds.length];
			for(int i=0; i<delIds.length; i++) {
				ids[i] = Integer.parseInt(delIds[i]);
			}		
			
			service.deleteNoticeAll(ids);
			break;
		}
		
		// 요청후 list페이지로 이동-> get요청 호출 
		response.sendRedirect("list");
		
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//list.jsp에서 list?f=title&q=a 로 전달
				
		String field_ = request.getParameter("f");
		String query_ = request.getParameter("q");
		String page_ = request.getParameter("p");
		
		String field = "title";// 기본값 
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
		int count = service.getNoticeCount(field, query);
		
		// view에 전달
		request.setAttribute("list", list);
		request.setAttribute("count", count);
		
		request.getRequestDispatcher("/WEB-INF/view/admin/board/notice/list.jsp").forward(request, response);

	}
	

}
