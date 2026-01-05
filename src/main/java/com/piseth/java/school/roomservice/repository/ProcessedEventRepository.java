package com.piseth.java.school.roomservice.repository;

import com.piseth.java.school.roomservice.domain.ProcessedEvent;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ProcessedEventRepository extends ReactiveMongoRepository<ProcessedEvent, String> {

    Mono<ProcessedEvent> findByAggregateTypeAndAggregateId(String aggregateType, String aggregateId);
}
