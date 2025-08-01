package com.app.dto.user;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {

	//필수 입력, 빈칸이 있으면 안됨
	@NotBlank(message = "아이디는 필수입니다.")
	//@NotBlank(message = "아이디는 필수입니다.")
	String id;
	
	//admin/users/add 아이디, 이름, 비밀번호 입력 안함
	//입력 길이 제한
	
	@Size(min = 8, max = 12, message = "비번 길이 확인하라고")
	//@Size(min = 8, max = 12, message = "비번 길이 확인하라고")
	String pw;
	String name;
	String userType; // CUS / ADM
					 // 사용자 계정 구분
					 // Customer / Admin
}