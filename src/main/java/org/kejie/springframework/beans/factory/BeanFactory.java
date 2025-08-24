package org.kejie.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guokejie
 * @Date 2025/8/24 15:26
 */
public class BeanFactory {
    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
