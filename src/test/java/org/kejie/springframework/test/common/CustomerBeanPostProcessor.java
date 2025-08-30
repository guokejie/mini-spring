package org.kejie.springframework.test.common;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.config.BeanPostProcessor;
import org.kejie.springframework.test.bean.Car;

/**
 * @author guokejie
 * @Date 2025/8/28 15:47
 */
public class CustomerBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessBeforeInitialization");
        if ("car".equals(beanName)) {
            ((Car) bean).setBrand("兰博基尼");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("CustomerBeanPostProcessor#postProcessAfterInitialization");
        return bean;
    }
}
