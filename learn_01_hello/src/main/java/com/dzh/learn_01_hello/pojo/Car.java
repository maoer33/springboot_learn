package com.dzh.learn_01_hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author 戴志豪
 * @date 2023/1/15 16:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "car")
//@Component
public class Car {

     String brand;
     int price;
}
