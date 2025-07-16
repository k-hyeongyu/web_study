package com.app.controller.study.practice.practice11;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {

	@GetMapping("/practice11/first")
	public String first(Model model, HttpSession session) {
		
		if(session.getAttribute("accessUrl") == null) {
			model.addAttribute("accessUrl", "/first");
		}else {
			model.addAttribute("accessUrl", session.getAttribute("accessUrl"));
			//										/firsthide3
			//										/firsthide4 /firsthide5
			
			session.removeAttribute("accessUrl");
			session.invalidate(); //세션 클리어
		}
		
		
		System.out.println("/practice11/first로 접근");
		System.out.println("------------------------");
		return "practice/practice11/targetPage";
	}

	@GetMapping("/practice11/firsthide1")
	public String firsthide1(Model model1) {
		model1.addAttribute("accessUrl", "/firsthide1");
		System.out.println("/practice11/firsthide1로 접근");
		System.out.println("------------------------");
		return "practice/practice11/targetPage";
	}

	@GetMapping("/practice11/firsthide2")
	public String firsthide2(Model model2) {
		System.out.println("/practice11/firsthide2로 접근");
		System.out.println("/practice11/first로 redirect");
		System.out.println("------------------------");
		return "redirect:/practice11/first";
	}

	@GetMapping("practice11/firsthide3")
	public String firsthide3(Model mode, HttpServletRequest session) {

		
		session.setAttribute("accessUrl", "/firsthide3");
		//firsthide3 에 접근했었다 라는 의미를  -> 전달 -> session 영역에 저장
//		ra.addFlashAttribute("accessUrl", "/firsthide3");
//		System.out.println("/practice11/firsthide3로 접근");
//		System.out.println("/practice11/first로 redirect");
//		System.out.println("------------------------");
		return "redirect:/practice11/first";
	}
}
