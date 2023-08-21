package com.tge.homework;

/**
 * ClassName: Homework6
 * Package: com.tge.homework
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/6 - 10:58
 * Version:
 */
public class Homework06 {
    public static void main(String[] args) {
        Person p = new Person("唐僧", new Horse());
        p.common();
        p.passRiver();
    }
}

interface Vehicles {
    public void traffic();
}

class Horse implements Vehicles {

    @Override
    public void traffic() {
        System.out.println("一般情况下使用马儿。。。");
    }
}

class Boat implements Vehicles {

    @Override
    public void traffic() {
        System.out.println("过河时候使用小船。。。");
    }
}

class VehiclesFactory {
    public static Horse getHorse() {
        return new Horse();
    }

    public static Boat getBoat() {
        return new Boat();
    }
}

class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver() {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.traffic();
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.traffic();
    }
}


