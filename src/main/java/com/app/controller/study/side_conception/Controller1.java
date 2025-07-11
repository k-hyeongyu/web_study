package com.app.controller.study.side_conception;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller1 {

	public void process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/board/faq.jsp");
		rd.forward(request, response);
	}
}
