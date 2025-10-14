package com.piseth.java.school.roomservice.service;

import com.piseth.java.school.roomservice.dto.RoomImportSummary;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.http.codec.multipart.FilePart;
import reactor.core.publisher.Mono;

public interface RoomImportService {

    Mono<RoomImportSummary> importRoom(FilePart filePart);
}
