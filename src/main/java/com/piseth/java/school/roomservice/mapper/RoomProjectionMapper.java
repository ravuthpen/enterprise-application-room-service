package com.piseth.java.school.roomservice.mapper;

import com.piseth.java.school.roomservice.domain.Address;
import com.piseth.java.school.roomservice.domain.GeoLocation;
import com.piseth.java.school.roomservice.domain.Room;
import com.piseth.java.school.roomservice.message.event.RoomFullPayload;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface RoomProjectionMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "lastEventAt", ignore = true)
    @Mapping(target = "deleted", constant = "false")
    Room toProjection(RoomFullPayload src);

    Address toAddress(RoomFullPayload.AddressPayload src);

    @Mapping(target = "latitude", source = "latitude")
    @Mapping(target = "longitude", source = "longitude")
    GeoLocation toGeo(RoomFullPayload.AddressPayload.GeoPayload src);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void merge(@MappingTarget Room target, RoomFullPayload src);
}
