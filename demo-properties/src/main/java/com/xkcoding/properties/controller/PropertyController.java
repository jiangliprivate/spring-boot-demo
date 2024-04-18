package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.Application1Property;
import com.xkcoding.properties.property.Developer1Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Controller:处理http请求
 * @RestController:Spring4之后新加的注解，原来返回json需要@ResponseBody配合@Controller
 * @RequestMapping:配置url映射
 *
 *
 * @RestController是一个组合注解，它包含了@Controller和@ResponseBody两个注解的功能。
 *
 * 用@RestController标记的类表示这是一个RESTful风格的控制器，它可以处理HTTP请求并返回JSON格式的响应。 @RestController注解在处理请求时，会自动将方法的返回值转换为JSON格式的响应体，并返回给客户端。
 *
 * 因此，使用@RestController可以省去在每个方法上都加@ResponseBody注解的麻烦。
 *
 * @RestController也支持@RequestMapping注解，用于映射请求。
 *
 * 例如，可以在@RestController中定义一个处理GET请求的方法，并使用@RequestMapping注解指定请求的URL和请求方法，如下所示：
 *
 * @RestController
 * @RequestMapping("/user")
 * public class UserController {
 *     @GetMapping("/{id}")
 *     public User getUserById(@PathVariable Long id) {
 *         // 根据id查询用户信息
 *         User user = userService.getUserById(id);
 *         return user;
 *     }
 * }
 * 上述代码中，@GetMapping注解表示该方法处理GET请求，{@code /{id}}表示URL中的参数，@PathVariable注解用于获取参数值。方法的返回值会自动转换为JSON格式的响应体，返回给客户端。 需要注意的是，使用@RestController时需要确保Spring的Jackson或Gson库已经正确配置，否则无法将Java对象转换为JSON格式的响应
 *
 * <p>
 * 测试Controller
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:49
 */
@RestController
public class PropertyController {
    private final Application1Property applicationProperty;
    private final Developer1Property developerProperty;

    //构造注入
    @Autowired
    public PropertyController(Application1Property applicationProperty, Developer1Property developerProperty) {
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
