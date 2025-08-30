package org.kejie.springframework.test.common;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.PropertyValue;
import org.kejie.springframework.beans.PropertyValues;
import org.kejie.springframework.beans.factory.ConfigurableListableBeanFactory;
import org.kejie.springframework.beans.factory.config.BeanDefinition;
import org.kejie.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author guokejie
 * @Date 2025/8/28 14:27
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition personBeanDefinition = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefinition.getPropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "111"));
    }
}
