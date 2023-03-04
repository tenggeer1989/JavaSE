package com.tge.test4;

public class Car {
    private String branch;
    private int price;
    private String color;


    public Car() {
    }

    public Car(String branch, int price, String color) {
        this.branch = branch;
        this.price = price;
        this.color = color;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


