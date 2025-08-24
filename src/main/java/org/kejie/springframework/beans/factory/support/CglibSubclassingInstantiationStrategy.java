package org.kejie.springframework.beans.factory.support;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.config.BeanDefinition;

/**
 * @author guokejie
 * @Date 2025/8/24 19:55
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, params, proxy) -> proxy.invokeSuper(obj, params)
        );
        return enhancer.create();
    }
}
