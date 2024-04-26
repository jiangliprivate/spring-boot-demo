package com.xkcoding.orm.mybatis.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xkcoding.orm.mybatis.plus.entity.User;
import com.xkcoding.orm.mybatis.plus.mapper.UserMapper;
import com.xkcoding.orm.mybatis.plus.service.UserService;
import org.springframework.stereotype.Service;

/**
 *
 * @Component和@Service是Spring框架中的两个常用注解，用于标识类的角色和作用。
 * @Component注解： @Component是一个通用的注解，用于标识一个普通的Spring管理的组件类。它可以用于任何类，表示这个类是一个受Spring容器管理的组件，可以通过依赖注入等方式在应用程序中使用。@Component注解没有特定的角色或功能，只是一个通用的标识。
 *
 * @Service注解： @Service注解是@Component注解的一个特例，它用于标识一个服务类。在Spring应用程序中，服务类通常用于实现业务逻辑，处理业务操作。通过使用@Service注解，我们可以将服务类与其他组件进行区分，使得代码更加清晰和可读性更高。同时，@Service注解还可以配合其他注解（如@Transactional）一起使用，提供事务管理的功能。
 *
 * <p>
 * User Service
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-08 18:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
