package com.lizy.mytest;

import com.lizy.mytest.domain.Blog;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lizy
 * @date 2021/7/21 15:21
 */
public class MainTest {

  public static void main(String[] args) throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    try (SqlSession session = sqlSessionFactory.openSession()) {
      Blog blog = (Blog) session.selectOne("com.lizy.mytest.mapper.BlogMapper.selectBlog", 101);
      System.out.println(blog.getTitle());


    }
  }

}
