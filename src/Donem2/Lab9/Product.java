
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Donem2.Lab9;

/**
 *
 * @author MrGodless
 */
public abstract class Product {
private final int ID; 
private final String NAME;
private double basePrice;
private double taxRate;

    public Product(int ID, String NAME, double basePrice, double taxRate) {
        this.ID = ID;
        this.NAME = NAME;
        this.basePrice = basePrice;
        this.taxRate = taxRate;
    }
    public int getID() {
        return ID;
    }
    
    public String getName() {
        return NAME;
    }

     public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    public void display()
    {
        System.out.println("Name: " +NAME);
        System.out.println("ID: " +ID);
        System.out.println("Base Price: " +basePrice);
        System.out.println("tax Rate: " +taxRate);
        
    }

    public abstract double calculateActualPrice();
    
}





