package com.app.controller.study.viewdata;

import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.compiler.Node.FallBackAction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.study.Product;


@Controller
public class ViewData01Controller {
	/*
	 FE 		--->  BE서버(Spring)   		---> DB
	 외부BE    		  return 'view이름'
	 (html/css/js)  <---- view지원(jsp)
	*/
	
	//--------1번
	@GetMapping("/viewData1")
	public String viewData1(HttpServletRequest request) {
		
		System.out.println("/viewData1 요청");
		System.out.println(request.getParameter("p1"));
		
		//request.setAttribute(key, value);
		request.setAttribute("store", "김밥천국");
		request.setAttribute("menu", "스팸정식");

		return "viewData/viewData1";
	}
	/*--------------------------------------------*/
	
	//--------2번
	@GetMapping("/viewData2")
	public String viewData2(Model model) {
		
		System.out.println("/viewData2 요청");
		
		model.addAttribute("store", "맘스터치");
		model.addAttribute("menu", "싸이버거");
		
		return "viewData/viewData1";
	}
	/*--------------------------------------------*/
	
	//--------3번
	@GetMapping("/viewData3")
	public ModelAndView viewData3() {
		System.out.println("/viewData3 요청");
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("viewData/viewData1");
		mav.addObject("store", "달식당");
		mav.addObject("menu", "돈까스");

		return mav;
	}
	/*--------------------------------------------*/
	
	//---------4번
	@GetMapping("/viewData4")
	public ModelAndView viewData4(ModelAndView mav) {
		System.out.println("/viewData4 요청");
		
		mav.setViewName("viewData/viewData1");
		mav.addObject("store", "달식당");
		mav.addObject("menu", "김밥");

		return mav;
	}
	/*--------------------------------------------*/
	
	//---------5번
	@GetMapping("/viewData5")
	public String viewData5(Model model) {
		//키,값만 넣는것이 아닌 객체 단위로 넣는것
		System.out.println("/viewData5 요청");
		
		Product product = new Product();
		product.setId("idid");
		product.setName("namepp");
		product.setPrice(9900);
		
		model.addAttribute("store", "맘스터치");
		model.addAttribute("menu", "싸이버거");
		model.addAttribute("product", product);
		
		return "viewData/viewData5";
	}
	/*--------------------------------------------*/
	
	//---------6번
	@GetMapping("viewData6")
	public String viewData6(HttpServletRequest request) {
		
		//../viewData6?searchKeyword=커피
		System.out.println("/viewData6 요청");
		
		//request.getParameter(null);

		//request.getParameter(null, request);

		String searchKeyword = request.getParameter("searchKeyword");
		
		request.setAttribute("store", "오늘 카페");
		request.setAttribute("menu", "고르시오");

		if(searchKeyword.equals("커피")){
			Product product = new Product();
			product.setId("cfe");
			product.setName("아메리카노");
			product.setPrice(5000);
			
			request.setAttribute("product", product);
		}else {
			Product product = new Product();
			product.setId("tea");
			product.setName("차");
			product.setPrice(4800);
			
			request.setAttribute("product", product);
		}
		
		return "viewData/viewData5";
	
	}
	/*--------------------------------------------*/
	
	//---------7번
	@GetMapping("viewData7")
	public String viewData7(Model model, @RequestParam(required = false) String searchKeyword) {
		
		//../viewData6?searchKeyword=커피
		System.out.println("/viewData7 요청");
		
		//request.getParameter(null);

		//request.getParameter(null, request);

		//String searchKeyword = request.getParameter("searchKeyword");
		
		model.addAttribute("store", "오늘 카페");
		model.addAttribute("menu", "고르시오");

		if(searchKeyword.equals("커피")){
			Product product = new Product();
			product.setId("cfe");
			product.setName("아메리카노");
			product.setPrice(5000);
			
			model.addAttribute("product", product);
		}else {
			Product product = new Product();
			product.setId("tea");
			product.setName("차");
			product.setPrice(4800);
			
			model.addAttribute("product", product);
		}
		
		return "viewData/viewData5";
	
	}
}

















