package com.piseth.java.school.roomservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    private String country;
    private String city;
    private String district;
    private String street;
    private String fullAddress;
    private GeoJsonPoint coordinates;    // GeoJson format for geospatial queries
}
