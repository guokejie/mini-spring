package org.kejie.springframework.test.bean;

/**
 * @author guokejie
 * @Date 2025/8/26 15:32
 */
public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
