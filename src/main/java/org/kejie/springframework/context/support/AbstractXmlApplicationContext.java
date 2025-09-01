package org.kejie.springframework.context.support;

import org.kejie.springframework.beans.BeansException;
import org.kejie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.kejie.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author guokejie
 * @Date 2025/8/30 14:36
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinition(DefaultListableBeanFactory beanFactory) throws BeansException {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
