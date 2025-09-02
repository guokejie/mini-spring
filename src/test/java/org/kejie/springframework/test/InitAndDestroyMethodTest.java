package org.kejie.springframework.test;

import org.junit.Test;
import org.kejie.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guokejie
 * @Date 2025/9/1 10:16
 */
public class InitAndDestroyMethodTest {

    @Test
    public void testInitAndDestroyMethod() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:init-and-destroy-method");

    }


}
