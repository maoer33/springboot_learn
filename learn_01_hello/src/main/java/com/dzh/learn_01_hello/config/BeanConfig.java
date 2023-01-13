package com.dzh.learn_01_hello.config;

import com.dzh.learn_01_hello.pojo.Pet;
import com.dzh.learn_01_hello.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 戴志豪
 * @date 2023/1/12 16:29
 */

/**
 * 1, 配置类里面使用@Bean标注在方法上给容器注册组件，默认也是单实例的
 * 2, 配置类本身也是组件
 * 3, proxyBeanMethods: 代理bean的方法
 *      处理组件依赖
 *      Full （proxyBeanMethods = true）
 *          SpringBoot 会检查容器中是否有对应组件并设置，可以保证获取的都是同一个组件，也就是容器中的组件
 *      Lite （proxyBeanMethods = false）
 *          SpringBoot 不会检查 容器中是否有 组件依赖的实例，会优化SpringBoot启动速度，
 *          当容器中存在大量Bean组件时，会产生很多的组件依赖，此时，多重检查，就会影响效率
 *
 */
@Configuration(proxyBeanMethods = true) // 告诉SpringBoot这是一个配置类 == bean.xml 这种配置文件（标注@Configuration注解的本身也是一个组件）
public class BeanConfig {

    /**
     * 给容器中添加组件，以方法名作为组件默认id
     *
     * @return  返回类型就是组件类型，返回值就是组件在容器中的实例，默认单实例
     */
    @Bean
    public User user01(){
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(pet());
        return zhangsan;
    }

    @Bean("tom")
    public Pet pet(){return new Pet("tomcat");}

}
