package com.tge.poly_;

/**
 * ClassName: Master
 * Package: com.tge.poly_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 11:12
 * Version:
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food){
        System.out.println("主人" + name + "正在用" + food.getName() + "喂" + animal.getName());
    }

    // public void feed(Dog dog,Bone bone){
    //     System.out.println("主人" + name + "正在用" + bone.getName() + "喂" + dog.getName());
    // }
    //
    // public void feed(Cat cat,Fish fish){
    //     System.out.println("主人" + name + "正在用" + fish.getName() + "喂" + cat.getName());
    // }
}
