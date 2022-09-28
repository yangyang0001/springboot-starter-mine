package com.deepblue.service;


import com.alibaba.fastjson.JSON;
import lombok.Data;

@Data
public class MineService {

    private String name;

    public String obj2json(Object object) {

        return name + "-@-" + JSON.toJSONString(object);
    }
}
