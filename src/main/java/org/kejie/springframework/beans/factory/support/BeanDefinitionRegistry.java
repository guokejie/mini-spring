package org.kejie.springframework.beans.factory.support;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 *
 * @author guokejie
 * @Date 2025/8/24 16:04
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     * 根据名称查找BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 是否包含指定名称的BeanDefinition
     *
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 返回所有注册表中的bean名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
