package com.dzh.learn_01_hello;

import com.dzh.learn_01_hello.config.BeanConfig;
import com.dzh.learn_01_hello.pojo.Pet;
import com.dzh.learn_01_hello.pojo.Tes1;
import com.dzh.learn_01_hello.pojo.User;
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

        // 从容器中获取bean, 容器中的bean对象默认是单例的
        Pet tom = run.getBean("tom", Pet.class);
        Pet tom2 = run.getBean("tom", Pet.class);

        System.out.println(tom);
        System.out.println(tom2);
        System.out.println(tom==tom2);


        // 从容器中获取配置bean, 实际获取到的是 com.dzh.learn_01_hello.config.BeanConfig$$EnhancerBySpringCGLIB$$d6af5fd9@444f44c5
        BeanConfig bean = run.getBean(BeanConfig.class);
        System.out.println(bean);

        // 如果@Configuration(proxyBeanMethods = true) 代理对象调用方法，SpringBoot总会检查这个组件是否在容器中,如果在容器中,则返回容器中的单实例
        // 保持组件单实例
        // 当proxyBeanMethods = false 时，拿到的bean组件就是没有被CGLIB代理的对象，此时调用方法获取对象，则会是一般新建的不同对象。
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user==user1);

        Tes1 bean1 = run.getBean(Tes1.class);
        System.out.println(bean1);

        boolean user0 = run.containsBean("user01");
        System.out.println(user0);

    }

}
