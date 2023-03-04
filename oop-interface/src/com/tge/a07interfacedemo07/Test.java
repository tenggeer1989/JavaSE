package com.tge.a07interfacedemo07;

public class Test {
    public static void main(String[] args) {
         /*接口中静态方法的定义格式：
          格式：public static 返回值类型 方法名（参数列表）{ }
          范例：public static void show(){   }

          接口中静态方法的注意事项：
               静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
               public可以省略，static不能省略
     */

        //调用接口中静态方法
        Inter.show();

        InterImpl.show();
    }

}
