package com.tge.exercise.exercise05;

import java.util.Objects;

/**
 * ClassName: Doctor
 * Package: com.tge.exercise.exercise05
 * Description:
 *
 * @Author: tge
 * @Create: 2023/8/2 - 10:15
 * Version:
 */
public class Doctor {
    private String name;
    private int age;
    private String job;
    private String gender;
    private double sal;

    public Doctor(String name, int age, String job, String gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ){
            return true;
        }
        if(!(o instanceof Doctor)){
            return false;
        }
        if(this.name.equals(((Doctor) o).getName()) && this.age == ((Doctor) o).getAge()){

            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, job, gender, sal);
    }
}
