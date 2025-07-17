package com.app.dao.room.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dto.room.Room;
import com.app.service.room.RoomService;

//데이터 소스와 통신하는 역할
//DB연결 역할 -> DAO, Repository
//DB : DAO, 외부 API 연동 Repository

@Repository
public class RoomDAOImpl implements RoomService{

	@Override
	public List<Room> findRoomList() {
		
		return null;
	}

}
