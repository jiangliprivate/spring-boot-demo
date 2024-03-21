package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
@RestController
public class PropertyController1 {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    //构造注入
    @Autowired
    public PropertyController1(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
        System.out.println("PropertyController1 applicationProperty = " + System.identityHashCode(applicationProperty));
        System.out.println("PropertyController1 developerProperty = " + System.identityHashCode(developerProperty));
    }

    @GetMapping("/property1")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }
}
