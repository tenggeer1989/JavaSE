package com.tge.try_;

import java.util.Scanner;

/**
 * ClassName: Homework01_Exception
 * Package: com.tge.try_
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/7 - 21:34
 * Version:
 */
public class Homework01_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        System.out.println("请输入第一个数据：");
        arr[0] = sc.nextLine();
        System.out.println("请输入第二个数据：");
        arr[1] = sc.nextLine();

        try {
            if(arr.length != 2){
                throw new ArrayIndexOutOfBoundsException("缺少参数");
            }
            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[1]);
            double result = cal(n1,n2);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + "参数格式不对");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + "分子不能为0");
        }

    }

    public static int cal(int n1, int n2){
        int result = n1 / n2;
        return result;
    }
}

