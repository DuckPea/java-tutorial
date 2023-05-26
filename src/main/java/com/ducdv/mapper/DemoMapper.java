//package com.ducdv.mapper;
//
//import com.ducdv.data.request.DemoRequest;
//import com.ducdv.data.response.DemoResponse;
//import org.springframework.beans.BeanUtils;
//import org.springframework.stereotype.Service;
//
///**
// * Created by DucDV on 26-05-2023
// * HN, VN.
// */
//@Service
//public class DemoMapper {
//
//    // function: map data request -> data response. retur DemoResponse.
//    // c1: Viết hàm map data
//    // c2: BeanUtils.copyProperties();
//    // c3: Mapstructs
//    //c1:
//    public DemoResponse demoMapperData(DemoResponse response, DemoRequest request) {
//        response.setName(request.getName());
//        response.setCode(request.getCode());
//        return response;
//        // ưu điểm: mình sẽ viết nó => kiểm soát được.
//        // nhược điểm: khi trong object mà có quá nhiều phần tử.
//    }
//    // c2 BeanUtils.copyProperties();
//    // ưu điểm: gọn và nhanh.
//    // nhược điểm: chỉ map được các phần tử cùng tên với nhau.
//
//    public DemoResponse demoMapperDataWithBeanUtils(DemoResponse response, DemoRequest request) {
//        BeanUtils.copyProperties(response, request);
//        return response;
//        // ưu điểm: mình sẽ viết nó => kiểm soát được.
//        // nhược điểm: khi trong object mà có quá nhiều phần tử.
//    }
//
//    //c3: mapstruct
//    public DemoResponse demoMapperDataWithMapstruct(DemoResponse response, DemoRequest request) {
//
//        return response;
//        // ưu điểm: nó sẽ sinh service mapper cho mình. hỗ trợ nhiều cho việc map data, có thể map list object với nhau. Lấy dữ liệu từ nhiều nguồn.
//        // nhược điểm:
//    }
//}
