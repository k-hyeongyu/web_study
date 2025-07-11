package com.app.controller.study.request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/* 컴포넌트 등록이 되려면, 
	servlet-context.xml 에 설정되어 있는
	context:component-scan base-package="com.app.controller"
	
	base-package 경로 하위에 존재 해야 함.
*/

//Controller 컴포넌트로 인식해서 스프링에 등록
@Controller // 어노테이션
public class Request01Controller {

	
	//-------------------기본 URL 요청과 응답------------------
	// 요청 들어오는 주소별로 맵핑
	@RequestMapping("/url1") //url1이라는 주소로 요청이 오면 이 메소드 실행 이라는 뜻
	public String url1() {
		return "url1";
		// 리턴하는 문자열의 이름을 가지고 있는 view 파일을 명시 -> view 파일로 연결
		// "url1"이라는 이름의 JSP 파일을 찾아서 사용자에게 보여줘.
		// ViewResolver 설정
		// /WEB-INF/views/ "return한view이름문자열" .jsp
	}

	@RequestMapping("/url2")
	public String url2() {
		return "home";
	}

	@RequestMapping("/url3")
	public String url3() {
		return "url3";
	}

	@RequestMapping("/url4") // GET POST 구분하지 않고 둘다 수신
	public String url4() {
		return "req/url4";
		// /WEB-INF/views/ .jsp
//	    /WEB-INF/views/     req/url4   .jsp
	}
	//-------------------기본 URL 요청과 응답------------------

	
	// HTTP 통신 Method = GET , POST , DELETE , PUT , PATCH
	// GET (조회 Read) , POST (저장 Insert/Write)
	
	// GET 방식 요청만 처리
	@RequestMapping(value = "/url5", method = RequestMethod.GET)
	public String url5() {
		return "req/url4";
	}

	// 인터넷 브라우저 주소창에 주소를 입력하고 이동하는 방식 -> GET 방식 요청
	// POST 방식 요청만 처리
	@RequestMapping(value = "/url6", method = RequestMethod.POST)
	public String url6() {
		return "req/url4";
	}
	
	// 최근에는 아래처럼 더 간단하게 사용
	@GetMapping("/url7") // GET 방식 전용
	public String url7() {
		return "req/url4";
	}

	@PostMapping("/url8") // POST 방식 전용
	public String url8() {
		return "req/url4";
	}

	@GetMapping("/request01/url9")
	public String url9() {
		return "req/url4";
	}
}
