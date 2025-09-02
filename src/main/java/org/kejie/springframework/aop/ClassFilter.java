package org.kejie.springframework.aop;

/**
 * @author guokejie
 * @Date 2025/9/2 21:31
 */
public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
