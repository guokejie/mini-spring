package org.kejie.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 *
 * @author guokejie
 * @Date 2025/8/26 16:24
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
