package com.lizy.mytest.test;

import com.lizy.mytest.domain.Article;
import com.lizy.mytest.mapper.ArticleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizy
 * @date 2021/7/23 9:55
 */
public class Test1 {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void prepare() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new
                SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    @Test
    public void testMyBatis() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ArticleMapper articleMapper = session.getMapper(ArticleMapper.class);
            List<Article> articles = articleMapper.
                    findByAuthorAndCreateTime("1", "2018-06-10");
            System.out.println(Arrays.toString(articles.toArray()));
        } finally {
            session.commit();
            session.close();
        }
    }
}