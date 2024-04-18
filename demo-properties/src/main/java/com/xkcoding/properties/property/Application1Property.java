package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 项目配置
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-09-29 10:50
 */
@Data // ==  @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.属于包org.projectlombok:lombok
@Component
public class Application1Property {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
