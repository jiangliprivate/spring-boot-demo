package com.xkcoding.orm.mybatis.mapper;

import com.xkcoding.orm.mybatis.entity.OrmUser;

public interface OrmUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrmUser record);

    int insertSelective(OrmUser record);

    OrmUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrmUser record);

    int updateByPrimaryKey(OrmUser record);
}