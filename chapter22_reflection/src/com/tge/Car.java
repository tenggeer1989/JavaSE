package com.tge;

/**
 * ClassName: Car
 * Package: com.tge
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/21 - 20:19
 * Version:
 */
public class Car {
    public String brand = "宝马";//品牌
    public int price = 500000;
    public String color = "白色";

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

}
