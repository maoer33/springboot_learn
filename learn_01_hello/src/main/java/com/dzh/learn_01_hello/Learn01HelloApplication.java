package com.dzh.learn_01_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Learn01HelloApplication {

    public static void main(String[] args) {
        // 返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(Learn01HelloApplication.class, args);

        // 获取所有默认装载的配置，也就是自动配置好的
        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }


    }

}
