package com.app.controller.study.practice.practice11;

import com.app.controller.study.request.BoardController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice11Controller {

	@GetMapping("/practice11/first")
	public String first(Model model) {
		model.addAttribute("accessUrl", "/first");
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
}
