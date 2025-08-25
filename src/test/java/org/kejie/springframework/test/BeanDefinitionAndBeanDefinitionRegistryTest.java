package org.kejie.springframework.test;

import org.junit.Test;
import org.kejie.springframework.beans.factory.config.BeanDefinition;
import org.kejie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.kejie.springframework.test.service.HelloService;

/**
 * @author guokejie
 * @Date 2025/8/24 16:19
 */
public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
        beanFactory.registryBeanDefinition("helloService", beanDefinition);

        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
