package org.kejie.springframework.beans;

/**
 * 自定义异常类
 *
 * @author guokejie
 * @Date 2025/8/24 15:42
 */
public class BeansException extends RuntimeException {

    /**
     * @param msg 异常信息
     */
    public BeansException(String msg) {
        super(msg);
    }

    /**
     * @param msg   异常信息
     * @param cause 记录原始异常的原因
     */
    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
