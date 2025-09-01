package org.kejie.springframework.context;

import org.kejie.springframework.beans.BeansException;

/**
 * @author guokejie
 * @Date 2025/8/30 11:25
 */
public interface ConfigurableApplicationContext extends ApplicationContext {
    /**
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
