package com.lizy.mytest.mapper;

import com.lizy.mytest.domain.Author;
import org.apache.ibatis.annotations.Param;

/**
 * @author lizy
 * @date 2021/7/23 10:29
 */
public interface AuthorMapper {

    Author findOne(@Param("id") int id);
}