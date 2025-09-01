package org.kejie.springframework.context;

import org.kejie.springframework.beans.factory.HierarchicalBeanFactory;
import org.kejie.springframework.beans.factory.ListableBeanFactory;
import org.kejie.springframework.core.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author guokejie
 * @Date 2025/8/30 11:21
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

}
