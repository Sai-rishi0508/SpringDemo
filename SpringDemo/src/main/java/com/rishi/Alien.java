package com.rishi;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int salary;
    private Laptop lap;
    public Alien(){
        System.out.println("object created for alien");
    }
    @ConstructorProperties({"age","lap","salary"})
    public Alien(int age, int salary, Laptop lap) {
        this.age = age;
        this.salary=salary;
        this.lap = lap;

    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code(){
        System.out.println("coding..");
        lap.compile();
    }
}
