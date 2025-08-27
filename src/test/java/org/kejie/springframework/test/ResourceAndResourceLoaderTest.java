package org.kejie.springframework.test;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.kejie.springframework.core.io.DefaultResourceLoader;
import org.kejie.springframework.core.io.FileSystemResource;
import org.kejie.springframework.core.io.Resource;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author guokejie
 * @Date 2025/8/27 16:15
 */
public class ResourceAndResourceLoaderTest {
    @Test
    public void testResourceLoader() throws Exception {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

        // 加载classpath下的资源
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
        assertThat(content).isEqualTo("hello world");

        //加载文件系统资源
        resource = resourceLoader.getResource("src/test/resources/hello.txt");
        assertThat(resource instanceof FileSystemResource).isTrue();
        inputStream = resource.getInputStream();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
        assertThat(content).isEqualTo("hello world");
    }
}
