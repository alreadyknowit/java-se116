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
public class Goat extends Animal{
    protected int lengthOfBeard;

  

    public Goat(int lengthOfBeard, String name, int age, int numberOfLegs) {
        super(name, age, numberOfLegs);
        this.lengthOfBeard = lengthOfBeard;
    }

    public int getLengthOfBeard() {
        return lengthOfBeard;
    }

    public void setLengthOfBeard(int lengthOfBeard) {
        this.lengthOfBeard = lengthOfBeard;
    }
    @Override
    public void printVoice()
    {
        System.out.println("BAAAAAAAAAAAAA");
    
    }
    @Override
    public void printAllData()
    {
        System.out.println("Info:");
        System.out.println("Name: " +getName());
        System.out.println("Age: " +age);
        System.out.println("Number of Legs: " +numberOfLegs);
        System.out.println("Legth Of Beard: " +getLengthOfBeard());
        System.out.println("Voice:");
        printVoice();
    }
    
    
}
