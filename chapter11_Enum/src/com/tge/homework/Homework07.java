package com.tge.homework;

/**
 * ClassName: Homework07
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 21:38
 * Version:
 */
public class Homework07 {
    public static void main(String[] args) {
        Car c1 = new Car(41);
        Car c2 = new Car(-10);
        Car c3 = new Car(23);

        c1.getAir().flow();
        c2.getAir().flow();
        c3.getAir().flow();
    }
}

class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow(){
            if(temperature > 40){
                System.out.println("空调吹冷气");
            } else if(temperature < 0){
                System.out.println("空调吹暖气");
            }else {
                System.out.println("空调关闭");
            }
        }
    }

    public Air getAir(){
        return new Air();
    }

}




