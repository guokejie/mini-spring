package org.kejie.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author guokejie
 * @Date 2025/9/2 21:31
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> targetClass);
}
