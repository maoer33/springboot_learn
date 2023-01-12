package com.dzh.learn_01_hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 戴志豪
 * @date 2023/1/11 10:31
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody Map<String,Object> hello(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("msg","helloSpringboot9999");
        return map;
    }

}
