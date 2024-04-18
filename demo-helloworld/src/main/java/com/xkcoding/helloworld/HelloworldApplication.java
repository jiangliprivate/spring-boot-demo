package com.xkcoding.helloworld;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SpringBoot启动类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-28 14:49
 */
//@Import({TomcatConfig.class})
@SpringBootApplication
//@SpringBootConfiguration //@Configuration:allow to register extra beans in the context or import additional configuration classes,现在可能部分功能还有重叠
//@EnableAutoConfiguration //enable Spring Boot’s auto-configuration mechanism
//@ComponentScan //enable @Component scan on the package where the application is located (see the best practices)
@RestController
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

    /**
     * Hello，World
     *
     * @param who 参数，非必须
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isBlank(who)) {
            who = "World";
        }
        return StrUtil.format("Hello, {}!", who);
    }
}
