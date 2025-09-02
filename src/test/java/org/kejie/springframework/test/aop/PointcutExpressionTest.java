package org.kejie.springframework.test.aop;

import org.junit.Test;
import org.kejie.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.kejie.springframework.test.service.HelloService;

import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author guokejie
 * @Date 2025/9/2 21:28
 */
public class PointcutExpressionTest {
    @Test
    public void testPointcutExpression() throws Exception {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* org.kejie.springframework" +
                ".test.service.HelloService.*(..))");
        Class<HelloService> clazz = HelloService.class;
        Method method = clazz.getDeclaredMethod("sayHello");
        assertThat(pointcut.matches(clazz)).isTrue();
        assertThat(pointcut.matches(method, clazz)).isTrue();
    }
}
