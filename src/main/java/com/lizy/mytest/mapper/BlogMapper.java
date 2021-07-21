package com.lizy.mytest.mapper;

import com.lizy.mytest.domain.Blog;

/**
 * @author lizy
 * @date 2021/7/21 15:34
 */
public interface BlogMapper {

  Blog selectBlog(Integer id);

}
