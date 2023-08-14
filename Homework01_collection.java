package com.tge.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Homework01_collection
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/12 - 10:38
 * Version:
 */
public class Homework01_collection {
    public static void main(String[] args) {
        News news1 = new News("新冠确诊病例超千万,数百万印度教徒赴恒河");
        News news2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList list = new ArrayList();
        list.add(news1);
        list.add(news2);

        for (int i = list.size() - 1; i >= 0; i--) {
            News news = (News) list.get(i);
            String title = news.getTitle();
            format(title);
        }

    }

    public static void format(String title) {

        if (title.length() > 15) {
            String str = title.substring(0, 15);
            String result = str + "...";
            System.out.println(result);
        }
    }

}

class News {
    private String title;
    private String content;

    public News(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title +
                '}';
    }
}
