package com.tge.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        //
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("lisi");
        t.setAge(28);

        Administrator a = new Administrator();
        a.setName("wangwu");
        a.setAge(25);

        register(s);
        register(t);
        register(a);

    }

    public static void register(Person p) {
        p.show();
    }
}
