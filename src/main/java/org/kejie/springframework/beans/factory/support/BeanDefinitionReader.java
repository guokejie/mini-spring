package org.kejie.springframework.beans.factory.support;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.core.io.Resource;
import org.kejie.springframework.core.io.ResourceLoader;

/**
 * 读取bean定义信息
 *
 * @author guokejie
 * @Date 2025/8/27 16:34
 */
public interface BeanDefinitionReader {
    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String[] locations) throws BeansException;
}
