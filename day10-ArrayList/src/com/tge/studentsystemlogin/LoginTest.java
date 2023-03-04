package com.tge.studentsystemlogin;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class LoginTest {
    public static void main(String[] args) {
        ArrayList<Login> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1-登陆");
            System.out.println("2-注册");
            System.out.println("3-忘记密码");
            System.out.println("4-退出");
            System.out.println("请选择操作:");

            String selection = sc.next();

            switch (selection) {
                case "1" -> login(list);
                case "2" -> register(list);
                case "3" -> retrieve(list);
                case "4" -> {
                    System.out.println("感谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("输入错误，请重新选择");
            }
        }
    }

    //注册
    public static void register(ArrayList<Login> list) {
        Scanner sc = new Scanner(System.in);
        //用户名验证
        String username;
        while (true) {
            System.out.println("请输入注册的用户名：");
            username = sc.next();
            boolean userContains = userContains(list, username);
            boolean length = userLength(username);
            boolean combine1 = userCombination1(username);
            boolean combine2 = userCombination2(username);

            if (userContains) {
                System.out.println("用户名已存在，请重新输入");
            } else if (length) {
                System.out.println("用户名长度必须在3~15位,请重新输入");
            } else if (combine1) {
                System.out.println("用户名不能为全数字，请重新输入");
            } else if (combine2) {
                System.out.println("用户名必须为字母加数字组合，请重新输入");
            } else {
                break;
            }
        }
        //密码输入
        String password;
        while (true) {
            System.out.println("请输入密码：");
            password = sc.next();
            System.out.println("请再次输入密码：");
            String passwordConfirm = sc.next();
            if (password.equals(passwordConfirm)) {
                System.out.println("密码确认成功");
                break;
            } else {
                System.out.println("两次输入密码不一致，请重新输入");
            }
        }
        //身份证号码验证
        String id;
        while (true) {
            System.out.println("请输入身份证号：");
            id = sc.next();
            boolean length = idLength(id);
            boolean zero = zero(id);
            boolean combination1 = idCombination1(id);
            boolean combination2 = idCombination2(id);
            if (length) {
                System.out.println("身份证号码长度错误，请重新输入");
            } else if (zero) {
                System.out.println("身份证号码不能以0开头,请重新输入");
            } else if (combination1) {
                System.out.println("前17位必须为数字，请重新输入");
            } else if (combination2) {
                System.out.println("最后一位必须是数字或大小写x，请重新输入");
            } else {
                break;
            }
        }
        //手机号码验证
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号码：");
            phoneNumber = sc.next();
            boolean length = phoneLength(phoneNumber);
            boolean zero = zero(phoneNumber);
            boolean combination1 = phoneCombination1(phoneNumber);

            if (length) {
                System.out.println("手机号码长度错误，请重新输入");
            } else if (zero) {
                System.out.println("手机号码不能以0开头,请重新输入");
            } else if (combination1) {
                System.out.println("手机号码必须都为数字，请重新输入");
            } else {
                break;
            }
        }
        //添加到对象中
        Login user = new Login(username, password, id, phoneNumber);
        list.add(user);
        System.out.println("注册成功");

        //打印验证
        printList(list);
    }

    //登陆
    public static void login(ArrayList<Login> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            boolean flag = userContains(list, username);
            if (!flag) {
                System.out.println("用户名" + username + "未注册，请先注册后登陆");
                return;
            }

            System.out.println("请输入密码：");
            String password = sc.next();
            while (true) {
                //先调用验证码
                String rightCode = getCode();
                System.out.println(rightCode);
                System.out.println("请输入验证码：");
                String code = sc.next();
                if (code.equalsIgnoreCase(rightCode)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误");
                }
            }

            //用户名和密码是否正确
            Login useInfo = new Login(username, password, null, null);
            boolean result = checkUserInfo(list, useInfo);
            if (result) {
                System.out.println("登陆成功");
                StudentSystem ss = new StudentSystem();
                break;
            } else {
                System.out.println("登陆失败，用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号已连续登陆3次失败被锁定，请5分钟后重试");
                    return;
                } else {
                    System.out.println("还剩下" + (2 - i) + "次登陆机会");
                }
            }
        }
    }

    //忘记密码
    public static void retrieve(ArrayList<Login> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        //判断用户名是否存在
        boolean flag = userContains(list, username);
        if (!flag) {
            System.out.println("该用户未注册,请先注册");
            return;
        }

        //如果用户已注册，输入身份证和手机号
        System.out.println("请输入身份证：");
        String id = sc.next();
        System.out.println("请输入手机号：");
        String phone = sc.next();

        int index = findIndex(list, username);
        String phoneNumber = list.get(index).getPhonenumber();
        String idNumber = list.get(index).getId();
        //比较手机号和身份证号
        if (!(id.equals(idNumber) && phone.equals(phoneNumber))) {
            System.out.println("手机号或身份证号输入错误，修改失败");
            return;
        }
        String password;
        while (true) {
            System.out.println("请输入新密码：");
            password = sc.next();
            System.out.println("请输入再次新密码：");
            String confirmPassword = sc.next();
            if (password.equals(confirmPassword)) {
                System.out.println("两次密码输入一致");
                break;
            } else {
                System.out.println("两次密码输入不一致，请重新输入");
            }
        }
        list.get(index).setPassword(password);
        System.out.println("密码修改成功");
    }

    //注册内使用的方法
    //打印注册用户
    private static void printList(ArrayList<Login> list) {
        for (int i = 0; i < list.size(); i++) {
            Login user = list.get(i);
            System.out.println(user.getUsername() + "," + user.getPassword() + "," + user.getId() + "," + user.getPhonenumber());
        }
    }

    //判断用户名是否存在
    public static boolean userContains(ArrayList<Login> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            Login user = list.get(i);
            String uid = user.getUsername();
            if (uid.equals(username)) {
                return true;
            }
        }
        return false;
    }

    //判断用户名长度
    public static boolean userLength(String username) {
        if (username.length() > 15 || username.length() < 3) {
            return true;
        }
        return false;
    }

    //判断是否全是数字
    public static boolean userCombination1(String username) {
        int numberCount = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= 48 && c <= 57) {
                numberCount++;
            }
        }
        if (numberCount == username.length()) {
            return true;
        }
        return false;
    }

    //判断是否有其他符号
    public static boolean userCombination2(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if ((c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57)) {
                count++;
            }
        }
        if (count < username.length()) {
            return true;
        }
        return false;
    }

    //判断身份证号码长度
    public static boolean idLength(String id) {
        return id.length() != 18;
    }

    //判断是否0开头
    public static boolean zero(String id) {
        if (id.charAt(0) == '0') {
            return true;
        }
        return false;
    }

    //判断前17为必须是数字
    public static boolean idCombination1(String id) {
        for (int i = 0; i < id.length() - 1; i++) {
            char c = id.charAt(i);
            if (!(c >= 48 && c <= 57)) {
                return true;
            }
        }
        return false;
    }

    //判断最后一位是数字或大小写X
    public static boolean idCombination2(String id) {
        char c = id.charAt(id.length() - 1);
        if (c == 88 || c == 120 || (c >= 48 && c <= 57)) {
            return false;
        }
        return true;
    }

    //判断手机号码长度
    public static boolean phoneLength(String phone) {
        if (phone.length() != 11) {
            return true;
        }
        return false;
    }

    //手机号码全为数字
    public static boolean phoneCombination1(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (!(c >= 48 && c <= 57)) {
                return true;
            }
        }
        return false;
    }

    //登陆内使用的方法
    //生成验证码
    public static String getCode() {
        //创建一个集合添加所有的大小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        StringBuilder sb = new StringBuilder();
        //随机抽取4个字符
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = r.nextInt(list.size());
            char c = list.get(index);

            sb.append(c);
        }
        //随机数字添加到末尾
        int number = r.nextInt(10);
        sb.append(number);


        //字符串变成字符，以便进行换位操作
        char[] arr = sb.toString().toCharArray();

        int randomIndex = r.nextInt(arr.length);
        //把随机索引中的字符和最大索引进行交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        //把字符数组变成字符串
        String s = new String(arr);
        return s;
    }

    //登陆用户名和密码是否正确
    private static boolean checkUserInfo(ArrayList<Login> list, Login useInfo) {
        for (int i = 0; i < list.size(); i++) {
            Login user = list.get(i);
            if (user.getUsername().equals(useInfo.getUsername()) && user.getPassword().equals(useInfo.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //忘记密码使用方法
    //获取用户索引
    private static int findIndex(ArrayList<Login> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            Login user = list.get(i);
            if (user.getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

}




