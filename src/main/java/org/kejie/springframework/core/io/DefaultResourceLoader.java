package org.kejie.springframework.core.io;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author guokejie
 * @Date 2025/8/26 16:25
 */
public class DefaultResourceLoader implements ResourceLoader {
    public static final String CLASSPATH_URL_PREFIX = "classpath:";

    @Override
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            // classpath下的资源
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        } else {
            try {
                // 尝试当成url来处理
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException e) {
                return new FileSystemResource(location);
            }
        }
    }
}
