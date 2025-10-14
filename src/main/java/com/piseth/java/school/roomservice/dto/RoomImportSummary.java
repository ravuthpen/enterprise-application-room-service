package com.piseth.java.school.roomservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoomImportSummary {

    private int inserted;
    private int skipped;
    private List<Integer> skippedRow;  //optional
    private Map<Integer, String> reasons;
}
