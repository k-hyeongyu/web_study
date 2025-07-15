package com.app.controller.study.redirect_forward;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Redirect_forward01Controller {

	@GetMapping("/re/re1")
	public String re1() {
		System.out.println("/re/re1 실행됨");
		return "/re/re1";
	}

	@GetMapping("/re/re2")
	public String re2(HttpServletRequest request) {

		System.out.println("/re/re2 실행됨");

		request.setAttribute("msg", request.getParameter("msg"));

		return "/re/re2";
	}

	@GetMapping("/re/re3")
	public String re3(HttpServletRequest request) {

		System.out.println("/re/re3 실행됨");
		System.out.println(request.getParameter("msg"));

		request.setAttribute("msg", request.getParameter("msg"));

		return "/re/re2";
	}

	@GetMapping("/re/re4")
	public String re4(HttpServletRequest request) {
		
		//페이지 내부의 redirect 처리
		System.out.println("/re/re4 실행됨");
		System.out.println(request.getParameter("msg"));
		
		return "/re/re4";
	}
	
	@GetMapping("/re/re5")
	public String re5(HttpServletRequest request) {
		
		//서버에서 redirect 처리
		System.out.println("/re/re5 실행함 근데 re1로 이동함");
		System.out.println(request.getParameter("msg"));
		
		return "redirect:/re/re1";	// /re/re1 경로로 redirect
		//화면 view return이 아님
		// view이름 return /WEB-INF/views  "re/re2"  .jsp
		//redirect는 주소창에 들어갈 경로ㅗ ! 
	}
	
	@GetMapping("/re/re6")
	public String re6(HttpServletRequest request) {
		
		//서버에서 forward 처리
		System.out.println("/re/re6 실행됨");
		System.out.println(request.getParameter("msg"));
		
		//forward 서버에서 바로 요청 경로를 바꿔서 수행
		//그대로 전달

		return "forward:/re/re2"; // RequestMapping 에 해당하는 경로를 작성 
	}
	
	@GetMapping("/re/re7")
	public String re7(HttpServletRequest request, RedirectAttributes ra) {
		
		//서버에서 redirect 처리
				System.out.println("/re/re7");
				System.out.println(request.getParameter("msg"));
				
				//request.setAttribute("msg", request.getParameter("msg")); //view 데이터/객체 전달용
				//redirect 시에 새로운 request 로 요청되기 때문에   redirect 하면 넘어가지 않는다
				
				
				//return "redirect:/re/re2";  // /re/re2 경로로 redirect 

				// redirect 경로에 직접 parameter 들어간 주소 형식으로 작성 /re/re2
				//return "redirect:/re/re2?msg=" + request.getParameter("msg");
				
				//RedirectAttributes 활용
				//ra.addAttribute("msg", request.getParameter("msg")); 
					//redirect 요청 주소 경로 뒤에 파라미터 추가해서 연결 
					//  -> 연결된 서버측 메소드에서도 경로에 있는 Parameter 확인 가능
				ra.addFlashAttribute("msg", request.getParameter("msg"));
					//redirect 요청 주소는 그대로
					//redirect 된 서버측 메소드에서 연결해주는 화면에서 사용할 수 있도록 전달 (model 저장됨)
					// request.getParameter 에서 확인 X
				
				return "redirect:/re/re2";
		// /re/re2 경로로 redirect

	}

	
}
