package com.lizy.mytest.mapper;

import com.lizy.mytest.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lizy
 * @date 2021/7/23 9:49
 */
public interface ArticleMapper {

    List<Article> findByAuthorAndCreateTime(@Param("author") String author,
                                            @Param("createTime") String createTime);

    Article findOne(@Param("id") int id);
}