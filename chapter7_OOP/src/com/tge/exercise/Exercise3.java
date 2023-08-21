package com.tge.exercise;

/**
 * ClassName: Exercise3
 * Package: com.tge.exercise
 * Description:
 *
 * @Author: tge
 * @Create: 2023/7/28 - 9:41
 * Version:
 */
public class Exercise3 {
    public static void main(String[] args) {
        Book b1 = new Book();
        int b1Price = b1.updatePrice(178);
        System.out.println(b1Price);
        int b2Price = b1.updatePrice(128);
        System.out.println(b2Price);
    }
}
class Book {


    public int updatePrice(int price){
        return price > 150 ? 150 : 100;
    }
}