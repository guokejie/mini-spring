package org.kejie.springframework.test.bean;

import org.kejie.springframework.beans.factory.DisposableBean;
import org.kejie.springframework.beans.factory.InitializingBean;

/**
 * @author guokejie
 * @Date 2025/8/25 11:22
 */
public class Person implements InitializingBean, DisposableBean {
    private String name;
    private int age;
    private Car car;

    public void customInitMethod() {
        System.out.println("我出生于方法: customInitMethod");
    }

    public void customDestroyMethod() {
        System.out.println("我死于方法: customDestroyMethod");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", car=" + car + '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("我死于方法: destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我出生于方法: afterPropertiesSet");
    }
}
