package com.lizy.mytest.test;

import com.lizy.mytest.domain.Article;
import com.lizy.mytest.domain.Author;
import com.lizy.mytest.mapper.ArticleMapper;
import com.lizy.mytest.mapper.AuthorMapper;
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
 * @date 2021/7/23 10:37
 */
public class Test2 {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void prepare() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }

    @Test
    public void testOne2One() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            ArticleMapper articleDao = session.getMapper(ArticleMapper.class);
            Article article = articleDao.findOne(1);
            Author author = article.getAuthor();
            article.setAuthor(null);
            System.out.println("\nauthor info:");
            System.out.println(author);
            System.out.println("\narticles info:");
            System.out.println("文章标题："+ article.getTitle());
        } finally {
            session.close();
        }
    }


    @Test
    public void testOne2Many() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            AuthorMapper authorDao = session.getMapper(AuthorMapper.class);
            Author author = authorDao.findOne(1);
            List<Article> arts = author.getArticles();
            List<Article> articles =
                    Arrays.asList(arts.toArray(new Article[arts.size()]));
            arts.clear();
            System.out.println("\nauthor info:");
            System.out.println(author);
            System.out.println("\narticles info:");
            articles.forEach(System.out::println);
        } finally {
            session.close();
        }
    }


}