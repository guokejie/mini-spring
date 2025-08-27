package org.kejie.springframework.beans.factory;

import org.kejie.springframework.beans.BeansException;

import java.util.Map;

/**
 * @author guokejie
 * @Date 2025/8/27 19:14
 */
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 返回指定类型的所有实例
     *
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回定义的所有bean名称
     *
     * @return
     */
    String[] getBeanDefinitionNames();
}
