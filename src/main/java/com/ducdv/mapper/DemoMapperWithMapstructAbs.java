package com.ducdv.mapper;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */

import com.ducdv.data.request.DemoRequest;
import com.ducdv.data.response.DemoResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public abstract class DemoMapperWithMapstructAbs {
    @Named("toResponse")
//    @Mapping(target = "name", ignore = true)
//    @Mapping(target = "code", source = "subCode")
    public abstract DemoResponse toResponse(DemoRequest request);

}
