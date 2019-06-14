package com.kgc.kd52.dao;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by jora on 2019/6/14.
 */
@Resource
public interface HrMapper {
    List<Map<String,Object>> query();
}
