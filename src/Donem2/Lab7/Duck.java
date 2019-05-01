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
public class Duck extends Animal{
    
    
    @Override
    public void printVoice()
    {
        System.out.println("Quack");
    }
    public Duck()
    {
      super();
    }
    public Duck(String name,int age,int numberOfLegs)
    {
        this.name= name;
        this.age=age;
        this.numberOfLegs=numberOfLegs;
    }
    
}
