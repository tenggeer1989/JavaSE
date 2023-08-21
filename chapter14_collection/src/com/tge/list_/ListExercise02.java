package com.tge.list_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ClassName: ListExercise02
 * Package: com.tge.list_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 23:13
 * Version:
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();


        list.add(new Book("红楼梦", 90, "曹雪芹"));
        list.add(new Book("哈利波特", 50, "JK罗琳"));
        list.add(new Book("水浒传", 9, "施耐庵"));
        list.add(new Book("三国演义", 80, "罗贯中"));
        list.add(new Book("西游记", 10, "吴承恩"));

        sort(list);


        for (Object o : list) {
            System.out.println(o);
        }



    }

    public static void sort(List list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Book book1 =(Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }

            }
        }
    }
}

class Book {
    private String name;
    private int price;
    private String author;

    public Book(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t \t价格：" + price + "\t \t作者：" + author;
    }
}

