package com.tge.poly_;

/**
 * ClassName: Poly01
 * Package: com.tge.poly_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/30 - 11:06
 * Version:
 */
public class Poly01 {
    public static void main(String[] args) {

        Master tom = new Master("tom");
        Animal animal = new Dog("aki");
        Food food  = new Bone("骨头");

        tom.feed(animal,food);


        Animal c = new Cat("huahua");
        Fish f = new Fish("黄花鱼");

        tom.feed(c,f);
        ((Cat) c).eat();



    }
}
