package com.app.controller.study.side_conception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller3 {
	
	//3-1)
	public MyModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// controller3 에서 처리해야하는 비즈니스 로직
		
		//request.getParam

		MyModelAndView mav = new MyModelAndView();
		mav.setViewName("/WEB-INF/views/practice03/home.jsp"); //화면(view) 정보
		//ViewResolver 설정 이전
		
		mav.addObject("product", "sdgasd");
		mav.addObject("itemvalue", "abc");
		
		return mav;
	} 	
	
	//3-2)
	public MyModelAndView process(Map<String, String> paramMap) {
		
		//paramMap.get("key"); 전달받은 파라미터 확인/활용
		
		MyModelAndView mav = new MyModelAndView();
		mav.setViewName("/WEB-INF/views/practice03/home.jsp"); //화면(view) 정보
		//ViewResolver 설정 이전
		
		mav.addObject("product", "sdgasd");
		mav.addObject("itemvalue", "abc");
		
		return mav;
	}
}