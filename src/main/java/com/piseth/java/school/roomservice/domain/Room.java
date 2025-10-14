package com.piseth.java.school.roomservice.domain;

import com.piseth.java.school.roomservice.domain.enumeration.GenderPreference;
import com.piseth.java.school.roomservice.domain.enumeration.PropertyType;
import com.piseth.java.school.roomservice.domain.enumeration.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Room {
	
	@Id
	private String id;
	private String name;
    private Double price;   // price per mount
    private Integer floor;
    private Double roomSize;    // square meters

    private Location location;

    private Boolean hasFan;
    private Boolean hasAirConditioner;
    private Boolean hasParking;
    private Boolean hasPrivateBathroom;
    private Boolean hasBalcony;
    private Boolean hasKitchen;
    private Boolean hasFridge;
    private Boolean hasWashingMachine;
    private Boolean hasTV;
    private Boolean hasWiFi;
    private Boolean hasElevator;

    private Integer maxOccupants;
    private Boolean isSmokingAllowed;

    private Boolean isPetFriendly;
    private Boolean isSharedRoom;
    private GenderPreference genderPreference;

    private RoomType roomType;
    private PropertyType propertyType;

    private Double distanceToCenter;    //optional
    private List<String> nearbyLandmarks;   // optional ex: ["university", "mall]

    private Boolean isUtilityIncluded;
    private Boolean depositRequired;
    private Integer minStayMonths;

    private Boolean hasPhotos;
    private Integer photoCount;
    private Boolean hasVideoTour;

    private Boolean verifiedListing;

    private LocalDateTime availableFrom;
    private LocalDateTime availableTo;

    private LocalDateTime createdAt;
    private LocalDateTime lastUpdated;

	private Map<String, Object> extraAttributes = new HashMap<>();

}
