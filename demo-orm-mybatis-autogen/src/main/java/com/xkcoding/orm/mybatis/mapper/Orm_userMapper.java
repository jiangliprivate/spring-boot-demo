package com.xkcoding.orm.mybatis.mapper;

import com.xkcoding.orm.mybatis.entity.Orm_user;

public interface Orm_userMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orm_user record);

    int insertSelective(Orm_user record);

    Orm_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orm_user record);

    int updateByPrimaryKey(Orm_user record);
}