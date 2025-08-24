package org.kejie.springframework.beans.factory.support;

import org.kejie.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 *
 * @author guokejie
 * @Date 2025/8/24 16:04
 */
public interface BeanDefinitionRegistry {
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
