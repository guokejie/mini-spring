package org.kejie.springframework.beans.factory.support;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.BeanFactory;
import org.kejie.springframework.beans.factory.config.BeanDefinition;
import org.kejie.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * 这里用到了模板方法设计模式
 *
 * @author guokejie
 * @Date 2025/8/24 15:55
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {


    /**
     * 负责流程控制，不关心具体细节
     * 细节交给抽象类去实现，方便不同实现（XML、注解等）
     *
     * @param name
     * @return
     * @throws BeansException
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    /**
     * 具体怎么创建 Bean（可能涉及构造、依赖注入、初始化回调）
     *
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

    /**
     * 从哪获取 Bean 定义（可能来自 XML、注解、JavaConfig）
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
