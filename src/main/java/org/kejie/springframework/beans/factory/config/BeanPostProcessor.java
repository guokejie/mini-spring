package org.kejie.springframework.beans.factory.config;

import org.kejie.springframework.beans.BeansException;

/**
 * @author guokejie
 * @Date 2025/8/28 15:43
 */
public interface BeanPostProcessor {

    /**
     * 在bean执行初始化之前执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;

    /**
     * 在bean执行初始化之后执行此方法
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;
}
