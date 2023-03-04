package com.tge.ifdemo;

import javax.swing.*;
import java.security.cert.CertificateRevokedException;
import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter seat number:");
        int number = sc.nextInt();

        if (number >= 0 && number <= 100) {
            if (number % 2 == 0) {
                System.out.println("right seat");
            } else {
                System.out.println("left seat");
            }
        } else if (number <= 0 || number >= 100) {
            System.out.println("error");

        }
    }
}
