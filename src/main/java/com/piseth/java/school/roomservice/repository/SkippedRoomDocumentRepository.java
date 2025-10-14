package com.piseth.java.school.roomservice.repository;

import com.piseth.java.school.roomservice.domain.SkippedRoomDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SkippedRoomDocumentRepository extends ReactiveMongoRepository<SkippedRoomDocument, String> {


}
