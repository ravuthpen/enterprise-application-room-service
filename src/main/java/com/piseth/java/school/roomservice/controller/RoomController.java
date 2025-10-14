package com.piseth.java.school.roomservice.controller;

import com.piseth.java.school.roomservice.dto.PageDTO;
import com.piseth.java.school.roomservice.dto.RoomDTO;
import com.piseth.java.school.roomservice.dto.RoomFilterDTO;
import com.piseth.java.school.roomservice.dto.RoomImportSummary;
import com.piseth.java.school.roomservice.service.RoomImportService;
import com.piseth.java.school.roomservice.service.RoomService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/rooms")
public class RoomController {


    private final RoomService roomService;
    private final RoomImportService roomImportService;

	/*
	public RoomController(RoomService roomService){
		this.roomService = roomService;
	}
	 */


    //create rooms
    @PostMapping
    public Mono<RoomDTO> createRoom( @Valid @RequestBody RoomDTO roomDTO) {

        return roomService.createRoom(roomDTO);
    }

    //get room by id
    @Operation(summary = "Get room by Id:", parameters = @Parameter(in = ParameterIn.PATH, name = "roomId"))
    @GetMapping("/{roomId}")
    public Mono<RoomDTO> getRoomById(@PathVariable String roomId) {
        return roomService.getRoomById(roomId);
    }

    //update rooms
    @PutMapping("/{roomId}")
    public Mono<RoomDTO> updateRoom(@PathVariable String roomId, @RequestBody RoomDTO roomDTO) {
        return roomService.updateRoom(roomId, roomDTO);
    }


    @DeleteMapping("/{roomId}")
    public Mono<Void> deleteRoom (@PathVariable String roomId){
        return roomService.deleteRoom(roomId);
    }

    //study purpose only

    @GetMapping("/searchroom")
    public Flux<RoomDTO> fineRoomByName(@RequestParam String name){

        return roomService.searchRoomByName(name);
    }

//    @GetMapping("/search") using mapper
//    public Flux<RoomDTO> getRoomByFilter(@RequestParam Map<String,String> params){
//       return roomService.getRoomByFilter(RoomFilterDTOMapper.toRoomFilterDTO(params));
//    }

    //without mapper using ModelAttribute (Opsonal)
    @GetMapping("/search")
    public Flux<RoomDTO> getRoomByFilter(@ModelAttribute RoomFilterDTO roomFilterDTO){
        return roomService.getRoomByFilter(roomFilterDTO);
    }

    @GetMapping("/search/pagination")
    public Mono<PageDTO<RoomDTO>> getRoomByFilterPagination(@ModelAttribute RoomFilterDTO roomFilterDTO){
        return roomService.getRoomByFilterPagination(roomFilterDTO);
    }

    @GetMapping("search/pagination2") // custom response =>add header => totalPage, pageElement
    public Mono<ResponseEntity<PageDTO<RoomDTO>>> getRoomByFilterPaginationWithHeader( @ModelAttribute RoomFilterDTO roomFilterDTO){
        return roomService.getRoomByFilterPagination(roomFilterDTO)
                .map(page-> ResponseEntity.ok()
                        .header("X-Total-Count", String.valueOf(page.getTotalElement()))
                        .body(page)
                );

    }

    //upload file excel to database
    @PostMapping(value = "/upload-excel", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<RoomImportSummary> uploadExcel(@RequestPart("file") FilePart filePart){
        return roomImportService.importRoom(filePart);
    }


}
