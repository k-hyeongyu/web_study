package com.app.controller.study.practice.practice13;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.util.MyCookieUtil;

@Controller
public class Practice13Controller {
	
	@GetMapping("/practice13/hideAd")
	public String hideAd(HttpServletResponse request){
		
		String hideAd = MyCookieUtil.getCookie(request, "hideAd");
		if(hideAd != null) {
			request.setAttribute("hideAd", hideAd);
		}
		return "practice/practice13/hideAd";
	}
	
	
	@PostMapping("/practice13/hideAd")
	public String hideAdAction(HttpServletResponse response, HttpServletRequest request){
		
		System.out.println(request.getParameter("hideAd"));
		
		if(request.getParameter("hideAd") != null) {
			Cookie ck = MyCookieUtil.createCookie("hideAd", "hideAd", 60 * 60 * 24);
			response.addCookie(ck);
		}
		
		return "redirect:/practice13/hideAd";
	}

}