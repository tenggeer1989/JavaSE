package com.tge.method.test;

public class Test3 {
    public static void main(String[] args) {
        compare(30,20);

    }

    public static void compare(byte b1, byte b2) {
        if (b1 > b2) {
            System.out.println(b1 + "is biggeer");
        }
    }

    public static void compare(short s1, short s2) {
        if (s1 > s2) {
            System.out.println(s1 + "is biggeer");
        }
    }
        public static void compare ( int i1, int i2) {
            if (i1 > i2) {
                System.out.println(i1 + "is biggeer");

            }
        }
            public static void compare ( long l1, long l2){
                if (l1 > l2) {
                    System.out.println(l1 + "is biggeer");
                }
            }
}

