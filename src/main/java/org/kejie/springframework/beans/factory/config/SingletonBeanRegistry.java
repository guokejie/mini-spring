package org.kejie.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author guokejie
 * @Date 2025/8/24 15:49
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
