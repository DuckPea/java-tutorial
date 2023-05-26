package com.ducdv.data.response;

import lombok.Data;

/**
 * Created by DucDV on 26-05-2023
 * HN, VN.
 */
@Data
public class DemoResponse {
    private String name;
    private String code;
    private String subCode;
    private String nameDemoMapper;
    private DemoSubResponse subResponse;
}
