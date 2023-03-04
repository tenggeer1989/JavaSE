package com.tge.test3;

public class Test {
    public static void main(String[] args) {

        //1.创建一个数组
        Product[] arr = new Product[3];


        //2.创建三个商品对象
        Product p1 = new Product("001","牙膏",10,100);
        Product p2 = new Product("002","牙刷",5,200);
        Product p3 = new Product("003","漱口水",20,50);

        //3.把商品添加到数组中
        arr[0]=p1;
        arr[1]=p2;
        arr[2]=p3;
        
        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            //Product product = arr[i];
            System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getPrice()+","+arr[i].getCount());
        }
    }
}
