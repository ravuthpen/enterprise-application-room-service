package com.piseth.java.school.roomservice.mapper;

import ch.qos.logback.core.model.ComponentModel;
import org.mapstruct.Mapper;

import com.piseth.java.school.roomservice.domain.Room;
import com.piseth.java.school.roomservice.dto.RoomDTO;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;


@Mapper(componentModel="spring")
public interface RoomMapper {
	
	Room  toRoom(RoomDTO roomDTO);
	RoomDTO toRoomDTO(Room room);

	@Mapping(target = "id", ignore = true)
	void updateRoomFromDTO(RoomDTO roomDTO, @MappingTarget Room entity);
	
	/*
	//DTO to Entity
	public Room toRoom(RoomDTO roomDTO) {
		Room room = new Room();
		room.setAttributes(roomDTO.getAttributes());
		room.setName(roomDTO.getName());
		return room;
	}
	
	//Entity to DTO
	public RoomDTO toRoomDTO(Room room) {
		RoomDTO dto = new RoomDTO();
		dto.setAttributes(room.getAttributes());
		dto.setName(room.getName());
		return dto;
	}
	*/

}
