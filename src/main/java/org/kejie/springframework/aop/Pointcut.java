package org.kejie.springframework.aop;

/**
 * 抽象切点（描述一组连接点）
 * 描述 “在哪些类、哪些方法上织入增强”，即通过 ClassFilter 和 MethodMatcher 来筛选连接点。
 *
 * @author guokejie
 * @Date 2025/9/2 21:30
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
