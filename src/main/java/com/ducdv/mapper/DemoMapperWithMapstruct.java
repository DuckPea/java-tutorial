package com.ducdv.mapper;

import com.ducdv.data.request.DemoRequest;
import com.ducdv.data.request.DemoSubRequest;
import com.ducdv.data.response.DemoResponse;
import com.ducdv.data.response.DemoSubResponse;
import org.mapstruct.*;

import java.util.List;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */
@Mapper(componentModel = "spring")
public interface DemoMapperWithMapstruct {
    @Named("toResponse")
    @Mapping(target = "name", ignore = true)
    @Mapping(target = "subCode", source = "code")
    @BeforeMapping
    DemoResponse toResponse(DemoRequest request,
                            @Context DemoSubRequest subRequest);

    @IterableMapping(qualifiedByName = "toResponse")
    List<DemoResponse> toResponses(List<DemoRequest> requests,
                                   @Context DemoSubRequest subRequest);

    // afterMapping.
    @AfterMapping
    static void afterToResponse(
            @MappingTarget DemoResponse response, DemoRequest request,
            @Context DemoSubRequest subRequest) {
//        response.setNameDemoMapper(request.getName());
        DemoSubResponse demoSubResponse = new DemoSubResponse();
        demoSubResponse.setCodeSubMapper(subRequest.getCodeSubMapper());
        demoSubResponse.setNameSubMapper(subRequest.getNameSubMapper());
        response.setSubResponse(demoSubResponse);

    }
}
