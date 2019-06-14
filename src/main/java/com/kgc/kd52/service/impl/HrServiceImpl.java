package com.kgc.kd52.service.impl;

import com.kgc.kd52.dao.HrMapper;
import com.kgc.kd52.service.HrService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by jora on 2019/6/14.
 */
@Service
public class HrServiceImpl implements HrService {
    @Resource
    private HrMapper mapper;
    @Override
    public List<Map<String, Object>> query() {
        return mapper.query();
    }
}
