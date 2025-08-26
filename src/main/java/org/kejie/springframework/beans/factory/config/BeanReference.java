package org.kejie.springframework.beans.factory.config;

/**
 * 一个bean对另一个bean的引用
 *
 * @author guokejie
 * @Date 2025/8/26 15:28
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
