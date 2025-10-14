package com.piseth.java.school.roomservice.service.impl;


import com.piseth.java.school.roomservice.domain.Room;
import com.piseth.java.school.roomservice.dto.RoomDTO;
import com.piseth.java.school.roomservice.mapper.RoomMapper;
import com.piseth.java.school.roomservice.repository.RoomCustomRepository;
import com.piseth.java.school.roomservice.repository.RoomRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RoomServiceImplTest {

    @Mock
    private  RoomRepository roomRepository;
    @Mock
    private  RoomMapper roomMapper;
    @Mock
    private  RoomCustomRepository roomCustomRepository;

    @InjectMocks
    private RoomServiceImpl roomService;

    //មិនថា function អីនោះទេ ពេល តេស (test) ត្រូវប្រើ void
    // សញ្ញា _ ក្នុង java មិនត្រូវប្រើទេ តែក្នុង តេស (test) អាចប្រើបាន

    @Test
    void createRoom_success(){

        //given
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setName("Luxury");

        Room room = new Room();
        room.setName("Luxury");

        //when
        when(roomMapper.toRoom(roomDTO)).thenReturn(room);
        when(roomRepository.save(room)).thenReturn(Mono.just(room));
        when(roomMapper.toRoomDTO(room)).thenReturn(roomDTO);

        //then
        StepVerifier.create(roomService.createRoom(roomDTO))
                .expectNext(roomDTO)
                .verifyComplete();

    }

}
