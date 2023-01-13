package com.dzh.learn_01_hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author 戴志豪
 * @date 2023/1/12 16:29
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pet {

    private String name;

}
class cat extends Pet{

    public static void main(String[] args) {
        cat cat = new cat();
        cat.setName("tomcat");

        System.out.println(cat);
    }
}
