package com.dzh.learn_01_hello.controller;

import com.dzh.learn_01_hello.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 戴志豪
 * @date 2023/1/11 10:31
 */
@RestController
public class HelloController {

    @Autowired
    private Car car;

    @GetMapping("/hello")
    public Map<String,Object> hello(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg","helloSpringboot9999");
        return map;
    }

    @GetMapping("/car")
    public Car car(){
        return car;
    }
}
