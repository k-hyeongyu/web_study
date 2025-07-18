package com.app.dto.room;

import lombok.Data;

//@Setter //get,set 자동 생성
//@Getter
//@ToString
//@NoArgsConstructor //매개변수 없이 만드는 생성자
//@AllArgsConstructor

@Data
public class Room {

	int roodId; //PK기본키 식별자
	String buildingName; //동 이름
	int roomNumber; //호실번호 1101 2307
	int floor; //층수
	int maxGuestCount; //최대 숙박인원
	String viewType; //뷰 구분코드
					 //오션뷰 시티뷰 마운틴뷰
					 //OCN  CTY  MOT
					 // 1    2    3
	
	//lombok이 있으면 get,set하지 않아도 가능
}
