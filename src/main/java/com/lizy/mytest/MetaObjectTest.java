package com.lizy.mytest;

import com.lizy.mytest.domain.Blog;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.session.Configuration;
import org.junit.Test;

/**
 * @author lizy
 * @date 2021/7/22 15:15
 */
public class MetaObjectTest {
    /**
     * MetaObject
     * 直接操作属性
     * 操作子属性
     * 自动创建属性对象
     * 自动查找属性名，支持下划线转驼峰
     * 基于索引访问数组
     */
    @Test
    public void test(){
        Blog blog = new Blog();
        Configuration configuration = new Configuration();
        final MetaObject metaObject = configuration.newMetaObject(blog);
        metaObject.setValue("title", "123456");
        final Object title = metaObject.getValue("title");
        System.out.println(title);

    }

}