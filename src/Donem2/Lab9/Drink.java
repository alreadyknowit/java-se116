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
public class Drink extends Product{

    private double volume;

    public Drink(double volume, int ID, String NAME, double basePrice, double taxRate) {
        super(ID, NAME, basePrice, taxRate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public double calculateActualPrice() {
       return getBasePrice()*volume*(1+getTaxRate());
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Volume: " +volume);
        System.out.println("Price: "+calculateActualPrice());
    }

    
}



