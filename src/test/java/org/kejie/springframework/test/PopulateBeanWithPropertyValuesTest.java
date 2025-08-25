package org.kejie.springframework.test;

import org.junit.Test;
import org.kejie.springframework.beans.PropertyValue;
import org.kejie.springframework.beans.PropertyValues;
import org.kejie.springframework.beans.factory.config.BeanDefinition;
import org.kejie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.kejie.springframework.test.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author guokejie
 * @Date 2025/8/25 11:23
 */
public class PopulateBeanWithPropertyValuesTest {

    @Test
    public void testPopulateBeanWithPropertyValues() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "gkj"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        beanFactory.registryBeanDefinition("person", beanDefinition);

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("gkj");
        assertThat(person.getAge()).isEqualTo(18);
    }
}
