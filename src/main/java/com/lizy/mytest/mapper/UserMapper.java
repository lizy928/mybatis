package com.lizy.mytest.mapper;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author lizy
 * @date 2021/7/22 13:59
 */
public interface UserMapper {

    @Select("select title from blog where id = #{arg0}")
    @Options
    public String getTitleById(Integer id);

}