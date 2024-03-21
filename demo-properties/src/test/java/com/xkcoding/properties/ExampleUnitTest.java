package com.xkcoding.properties;

import org.junit.Test;


public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        MyTestBean m=new MyTestBean();
        m.setId(1);
        m.setName("zhangsan");
        m.setPassword("123456");
        System.out.println(m);
    }
}
