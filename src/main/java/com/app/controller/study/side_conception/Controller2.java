package com.app.controller.study.side_conception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller2 {

	public MyView process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// controller2 에서 처리해야하는 비즈니스 로직

		// View에 대한 정보를 MyView 객체로 만들어서 전달
		MyView myView = new MyView();
		myView.viewName = "/WEB-INF/views/board/faq.jsp";

		return myView;
	}
}
