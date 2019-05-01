/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab7;

/**
 *
 * @author Godless Chicken
 */
public class Animal {
    
    protected String name;
    protected int age;
    protected int numberOfLegs;
    
    public Animal()
    {
        this.name="No name";
        this.age=0;
        this.numberOfLegs=0;
    }
    
    public Animal(String name,int age,int numberOfLegs)
    {
        this.name=name;
        this.age=age;
        this.numberOfLegs=numberOfLegs;
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

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    
    public void printVoice()
    {
        System.out.println("This class will diplay voice of the subclass.");
    }
    public void printAllData()
    {
        System.out.println("Info:");
        System.out.println("Name: " +getName());
        System.out.println("Age: " +age);
        System.out.println("Number of Legs: " +numberOfLegs);
        System.out.println("Voice:");
        printVoice();
    }
}
