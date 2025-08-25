package org.kejie.springframework.beans;

/**
 * bean属性信息
 *
 * @author guokejie
 * @Date 2025/8/25 11:04
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}