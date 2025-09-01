package org.kejie.springframework.test;

import org.junit.Test;
import org.kejie.springframework.context.support.ClassPathXmlApplicationContext;
import org.kejie.springframework.test.bean.Car;
import org.kejie.springframework.test.bean.Person;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author guokejie
 * @Date 2025/8/30 11:18
 */
public class ApplicationContextTest {
    @Test
    public void testApplicationContext() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
        assertThat(person.getName()).isEqualTo("111");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println(car);

        //brand属性在CustomerBeanPostProcessor中被修改为lamborghini
        assertThat(car.getBrand()).isEqualTo("兰博基尼");
    }
}
