package com.piseth.java.school.roomservice.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
@Document(collation = "skipped_rooms")
public class SkippedRoomDocument {

    @Id
    private String id;

    private int rowNumber;
    private Map<String, Object> rowData;
    private String reasons;
    private LocalDateTime uploadDate;
    private String uploadBatchId;
}
