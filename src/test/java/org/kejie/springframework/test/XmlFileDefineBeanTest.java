package org.kejie.springframework.test;

import org.junit.Test;
import org.kejie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.kejie.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.kejie.springframework.test.bean.Person;

/**
 * @author guokejie
 * @Date 2025/8/27 16:30
 */
public class XmlFileDefineBeanTest {

    @Test
    public void testXmlFile() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);

    }
}
