package com.tge.a02oopextandsdemo2;

public class SharPei  extends Dog{
    @Override
    public void eat(){
        super.eat();//吃狗粮
        System.out.println("吃狗粮,吃骨头");
    }

}
