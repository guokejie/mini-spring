package org.kejie.springframework.beans.factory;

/**
 * @author guokejie
 * @Date 2025/9/1 10:12
 */
public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
