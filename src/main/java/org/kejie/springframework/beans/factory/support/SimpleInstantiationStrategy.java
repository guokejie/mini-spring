package org.kejie.springframework.beans.factory.support;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author guokejie
 * @Date 2025/8/24 19:52
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {
    /**
     * 简单的 Bean 实例化策略，根据 bean 的无参构造实例化对象
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            Constructor constructor = beanClass.getConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("实例化[" + beanClass.getName() + "]失败", e);
        }
    }
}
