/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab5;

public class Cars {
    
    private int modelYear;
    private String model;
    private double topSpeed;
    private double price;
    private Engine eng;

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
    
    public int getModelYear() {
        return modelYear;
    }

    public String getModel() {
        return model;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setModel(String modelş) {
        this.model = model;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Cars()
    {
        modelYear=0;
        model="Unknown";
        topSpeed=0.0;
        price=0.0;
    }
   public static void PrintInfo(Cars[] ar)
    {
        for(int i=0; i<ar.length; i++)
        {
        System.out.println("Model Year  : " + ar[i].getModelYear());
        System.out.println("Model       : " + ar[i].getModel());
        System.out.println("Top Sepeed  : " + ar[i].getTopSpeed());
        System.out.println("Price       : " + ar[i].getPrice());
        System.out.println("Volume      : " + ar[i].getEng().getVolume() );
        System.out.println("Num. of Cyl : " + ar[i].getEng().getCylinders());
        }
        
    }  
    
}
