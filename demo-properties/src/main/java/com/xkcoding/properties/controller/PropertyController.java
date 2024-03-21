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
public class PropertyController {
    private final ApplicationProperty applicationProperty;
    private final DeveloperProperty developerProperty;

    //构造注入
    @Autowired
    public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty) {
        this.applicationProperty = applicationProperty;
        this.developerProperty = developerProperty;
        System.out.println("PropertyController applicationProperty = " + System.identityHashCode(applicationProperty));
        System.out.println("PropertyController developerProperty = " + System.identityHashCode(developerProperty));
    }

    @GetMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }
}
