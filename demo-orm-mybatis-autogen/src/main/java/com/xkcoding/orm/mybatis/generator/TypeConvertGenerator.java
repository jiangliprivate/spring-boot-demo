package com.xkcoding.orm.mybatis.generator;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 替换Generator指定生成的指定类型
 * @author William
 * @date 2020/07/13
 */
public class TypeConvertGenerator extends JavaTypeResolverDefaultImpl {

    public TypeConvertGenerator(){
        super();
        super.typeMap.put(Types.DATE,new JdbcTypeInformation("DATE",new FullyQualifiedJavaType(LocalDate.class.getName())));
        super.typeMap.put(Types.TIME,new JdbcTypeInformation("TIME",new FullyQualifiedJavaType(LocalTime.class.getName())));
        super.typeMap.put(Types.TIMESTAMP,new JdbcTypeInformation("TIMESTAMP",new FullyQualifiedJavaType(LocalDateTime.class.getName())));
    }
}
