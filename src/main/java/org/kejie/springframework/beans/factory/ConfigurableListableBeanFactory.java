package org.kejie.springframework.beans.factory;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.kejie.springframework.beans.factory.config.BeanDefinition;
import org.kejie.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @author guokejie
 * @Date 2025/8/27 20:14
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
