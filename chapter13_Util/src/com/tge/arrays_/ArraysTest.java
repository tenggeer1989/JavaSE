package com.tge.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ArraysTest
 * Package: com.tge.arrays_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/8 - 22:45
 * Version:
 */
public class ArraysTest {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新版",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("java从入门到放弃",300);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].toString());
        }


    }
}

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
