package com.app.controller.study.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

	@GetMapping("/member/signup")
	public String signup() {
		System.out.println("member/signup [GET요청] 들어옴");
		return "member/signup";
	}

}