package com.ducdv.controller;

import com.ducdv.data.request.DemoRequest;
import com.ducdv.data.request.DemoSubRequest;
import com.ducdv.data.response.DemoResponse;
import com.ducdv.service.IDemoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */
@RestController
@RequestMapping("/api/demo")
public class DemoController {
    private final IDemoService demoService;

    public DemoController(IDemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("")
    public ResponseEntity<DemoResponse> getDemo() {
        DemoRequest demoRequest = new DemoRequest();
        demoRequest.setCode("demoAbc");
        demoRequest.setName("nameDemo");
        DemoSubRequest demoSubRequest = new DemoSubRequest();
        demoSubRequest.setCodeSubMapper("demoCode");
        demoSubRequest.setNameSubMapper("demoName");
        return new ResponseEntity<>(demoService.toResponse(demoRequest, demoSubRequest), HttpStatus.OK);
    }
}
