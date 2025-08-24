package org.kejie.springframework.test.ioc;

import org.junit.Test;
import org.kejie.springframework.beans.factory.BeanFactory;

/**
 * @author guokejie
 * @Date 2025/8/24 15:28
 */
public class SimpleBeanContainerTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());

    }


    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
