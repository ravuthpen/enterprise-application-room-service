package com.piseth.java.school.roomservice.service;

import com.piseth.java.school.roomservice.dto.PageDTO;
import com.piseth.java.school.roomservice.dto.RoomDTO;

import com.piseth.java.school.roomservice.dto.RoomFilterDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface RoomService {
	
	Mono<RoomDTO> createRoom(RoomDTO roomDTO);
	Mono<RoomDTO> getRoomById(String id);
	Mono<RoomDTO> updateRoom(String id, RoomDTO roomDTO);
	Mono<Void> deleteRoom(String id);

	//study purpose only
	Flux<RoomDTO> searchRoomByName(String name);
	Flux<RoomDTO> getRoomByFilter(RoomFilterDTO filterDTO); //will be deleted
	Mono<PageDTO<RoomDTO>> getRoomByFilterPagination(RoomFilterDTO filterDTO);

}
