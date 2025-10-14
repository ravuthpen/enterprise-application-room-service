package com.piseth.java.school.roomservice.repository;

import com.piseth.java.school.roomservice.domain.Room;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RoomRepository extends ReactiveMongoRepository<Room, String> {

    //study purpose only
    Flux<Room> findByNameContainingIgnoreCase(String name);

    @Query("{'name': ?0}")
    Flux<Room> findRoom(String name);

}
