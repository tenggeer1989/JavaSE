package com.tge.poly_;

import javax.lang.model.element.NestingKind;

/**
 * ClassName: Animal
 * Package: com.tge.poly_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 11:10
 * Version:
 */
public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
