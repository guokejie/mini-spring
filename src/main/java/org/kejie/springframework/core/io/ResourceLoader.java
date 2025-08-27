package org.kejie.springframework.core.io;

/**
 * 资源加载器接口
 *
 * @author guokejie
 * @Date 2025/8/26 16:25
 */
public interface ResourceLoader {
    Resource getResource(String location);
}
