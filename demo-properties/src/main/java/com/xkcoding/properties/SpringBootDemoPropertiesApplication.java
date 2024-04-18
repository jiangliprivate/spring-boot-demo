package com.xkcoding.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:48
 */
//@SpringBootApplication
@EnableAutoConfiguration //: enable Spring Boot’s auto-configuration mechanism,至少要允许自动配置程序才能正常运行
@ComponentScan//: enable @Component scan on the package where the application is located (see the best practices),没有这个注解,@Component相关类就无法加载
//@Configuration: allow to register extra beans in the context or import additional configuration classes
public class SpringBootDemoPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoPropertiesApplication.class, args);
    }
}
