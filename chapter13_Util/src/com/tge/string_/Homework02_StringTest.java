package com.tge.string_;

import java.util.Scanner;

import static java.lang.Integer.*;

/**
 * ClassName: Homework02_StringTest
 * Package: com.tge.string_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/9 - 18:48
 * Version:
 */
public class Homework02_StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("请输入用户名：");
                String userName = sc.nextLine();
                userName(userName);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("请输入密码：");
                String password = sc.nextLine();
                password(password);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("请输入邮箱：");
                String email = sc.nextLine();
                email(email);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("注册成功！！！！");

    }

    public static void userName(String name) {
        if (!(name.length() == 2 || name.length() == 3 || name.length() == 4)) {
            throw new RuntimeException("用户名必须为2-4位");
        }
    }
    public static void password(String password){
        if(password.length() != 6){
            throw new RuntimeException("密码长度必须为6位");
        }
        for (int i = 0; i < password.length(); i++) {
            if(!(password.charAt(i) >= 48 && password.charAt(i) <= 57) ){
                throw new RuntimeException("密码必须为数字");
            }
        }
    }
    public static void email(String email){
        if(email.charAt(0) == '@'){
            throw new RuntimeException("邮箱第一位不能为@");
        }
        if(!(email.contains("@") && email.contains("."))){
            throw new RuntimeException("邮箱必须包含@和.");
        }
        if(email.indexOf("@") > email.indexOf(".")){
            throw new RuntimeException("@必须在.前面");
        }
    }
}
