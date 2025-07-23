package com.app.service.room;

import java.util.List;

import com.app.dto.room.Room;

public interface RoomService {

	List<Room> findRoomList();
		
	int saveRoom(Room room);
	
	int removeRoom(int roomId);

	Room findRoomByRoomId(int roomId);
	
	int modifyRoom(Room room);
}
