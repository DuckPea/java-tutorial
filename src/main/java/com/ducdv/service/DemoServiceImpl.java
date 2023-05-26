package com.ducdv.service;

import com.ducdv.data.request.DemoRequest;
import com.ducdv.data.request.DemoSubRequest;
import com.ducdv.data.response.DemoResponse;
import com.ducdv.mapper.DemoMapperWithMapstruct;
import org.springframework.stereotype.Service;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */
@Service
public class DemoServiceImpl implements IDemoService{
    private final DemoMapperWithMapstruct demoMapperWithMapstruct;

    public DemoServiceImpl(DemoMapperWithMapstruct demoMapperWithMapstruct) {
        this.demoMapperWithMapstruct = demoMapperWithMapstruct;
    }

    @Override
    public DemoResponse toResponse( DemoRequest request, DemoSubRequest subRequest) {
        DemoResponse response = demoMapperWithMapstruct.toResponse(request, subRequest);
        return response;
    }
}
