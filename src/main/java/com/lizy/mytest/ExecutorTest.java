package com.lizy.mytest;

import org.apache.ibatis.session.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizy
 * @date 2021/7/22 13:09
 */
public class ExecutorTest {
    private SqlSession sqlSession;

    @Before
    public void init(){
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = factoryBuilder.build(ExecutorTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml"));
        sqlSession = factory.openSession();
    }

    @Test
    public void test(){
        List<Object> res = new ArrayList<>();
        ResultHandler resultHandler = context -> {
            if(context.getResultCount() == 1){
                context.stop();
            }
            res.add(context.getResultObject());
        };
        sqlSession.select("com.lizy.mytest.mapper.UserMapper.getTitleById", resultHandler);
        System.out.println(Arrays.toString(res.toArray()));
    }


    @After
    public void close(){
        sqlSession.close();
    }
}