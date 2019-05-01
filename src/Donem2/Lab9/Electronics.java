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
public class Electronics extends Product{
    
    private double energyConsumption;

    public Electronics(double energyConsumption,int ID, String NAME, double basePrice, double taxRate) {
        super(ID, NAME, basePrice, taxRate);
        this.energyConsumption=energyConsumption;
    }
    
    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    @Override
    public double calculateActualPrice() {
        return getBasePrice()*energyConsumption*(1+getTaxRate());
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Energy Consumption: " +energyConsumption );
        System.out.println("Price: " +calculateActualPrice());
    }
    
}


