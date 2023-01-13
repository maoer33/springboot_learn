package com.dzh.learn_01_hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author 戴志豪
 * @date 2023/1/12 16:26
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String name;
    private int age;
    private Pet pet;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
