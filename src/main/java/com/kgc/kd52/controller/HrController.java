package com.kgc.kd52.controller;

import com.kgc.kd52.service.HrService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by jora on 2019/6/14.
 */
@RestController
public class HrController {
    @Resource
    private HrService service;
    @RequestMapping("/query.do")
    List<Map<String,Object>> query(){
     return service.query();
    };

}
