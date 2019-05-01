/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab9;

/**
 *
 * @author Godless Chicken
 */
public class Food extends Product  {

    private double weight;

    public Food(double weight, int ID, String NAME, double basePrice, double taxRate) {
        super(ID, NAME, basePrice, taxRate);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public double calculateActualPrice() {
        
       return getBasePrice()*weight*(1+getTaxRate());
    }
    
    @Override
    public void display()
    {
     super.display();
        System.out.println("Weight: " +getWeight());
        System.out.println("Price: " +calculateActualPrice());
    }
    
    
}


