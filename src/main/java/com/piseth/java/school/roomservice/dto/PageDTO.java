package com.piseth.java.school.roomservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Paginated response wrapper") //សម្រាប់ Open api
public class PageDTO <T>{
    @Schema(description = "Current page number (0-based)")
    private int page; //page number
    @Schema(description = "Number of recode per page")
    private int size;
    @Schema(description = "Total number of recode")
    private long totalElements;
    @Schema(description = "Total number of page")
    private int totalPage;
    @Schema(description = "Current page data list")
    private List<T> content;
}
