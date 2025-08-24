package org.kejie.springframework.beans.factory;

import org.kejie.springframework.beans.BeansException;

/**
 * Bean工厂
 *
 * @author guokejie
 * @Date 2025/8/24 15:26
 */
public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;
}
