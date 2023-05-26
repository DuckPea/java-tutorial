package com.ducdv.service;

import com.ducdv.data.request.DemoRequest;
import com.ducdv.data.request.DemoSubRequest;
import com.ducdv.data.response.DemoResponse;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */
public interface IDemoService {
    DemoResponse toResponse(DemoRequest request, DemoSubRequest subRequest);
}
