package com.lizy.mytest.test;

import com.lizy.mytest.domain.Author;
import org.apache.ibatis.scripting.xmltags.ExpressionEvaluator;
import org.junit.Test;

/**
 * @author lizy
 * @date 2021/7/23 11:00
 */
public class OgnlTest {

    @Test
    public void test(){
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        Author author = new Author();
        final boolean b = evaluator.evaluateBoolean("name == null && id == null", author);
        System.out.println(b);

    }


}