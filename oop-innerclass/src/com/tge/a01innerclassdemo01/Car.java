package com.tge.a01innerclassdemo01;

public class Car {
    String carName;
    int carAge;
    String carColor;

    class Engine{
        String engineName;
        int engineAge;


        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
    public void show(Car this){
        Engine e = new Engine();
        System.out.println(e.engineName);
        System.out.println(carName);

    }

}
