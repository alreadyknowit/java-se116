
package Donem2.Lab9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MrGodless

 */
public class Test {
    public static void main(String[] args) {
        
        ArrayList<Product> products = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        
        displayMenu();
        
        System.out.println("Your choice?");
        int response =sc.nextInt();
        
        switch(response)
        {
            case 1:
               
                String name;
                int ID;
                double basePrice,taxRate,energyConsumption,weight,volume;            
                
             System.out.println("Add food products");    
        for(int i=0;i<2;i++)
        {
            System.out.print("Name: ");
            name=sc.nextLine();
            
            System.out.print("ID: ");
            ID=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Base Price: ");
            basePrice=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Tax Rate: ");
            taxRate=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Weight: ");
            weight=sc.nextDouble();
            sc.nextDouble();
            
            Product foodProduct = new Food(weight,ID, name, basePrice, taxRate);
            
            products.add(foodProduct);
        }
        
         System.out.println("Add drink products");
        for(int i=0;i<2;i++)
        {
            System.out.print("Name: ");
            name=sc.nextLine();
            
            System.out.print("ID: ");
            ID=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Base Price: ");
            basePrice=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Tax Rate: ");
            taxRate=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Volume: ");
            volume=sc.nextDouble();
            sc.nextDouble();
            
            Product drinkProduct = new Drink(volume,ID, name, basePrice, taxRate);
            
            products.add(drinkProduct);
        }
        
                System.out.println("Add electronics products");
                
                for(int i=0;i<2;i++)
        {
            System.out.print("Name: ");
            name=sc.nextLine();
            
            System.out.print("ID: ");
            ID=sc.nextInt();
            sc.nextLine();
            
            System.out.print("Base Price: ");
            basePrice=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Tax Rate: ");
            taxRate=sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Volume: ");
            energyConsumption=sc.nextDouble();
            sc.nextDouble();
            
            Product eleProduct = new Electronics(energyConsumption,ID, name, basePrice, taxRate);
            
            products.add(eleProduct);
        }
        break;
        
            case 2:
                System.out.println("Printing the total price of the products");
                double total=0;
                for(int i=0;i<products.size();i++)
                {
                    total+=products.get(i).calculateActualPrice();
                }
                System.out.println("Total Price: " +total);
                break;
            case 3:
                System.out.println("To exit system press 1");
                System.exit(1);
                break;
        }
        
    }
    
    public static void displayMenu(){
        System.out.println("***Press 1 to add product to shopping card***");
        System.out.println("***Press 2 to print total price of the product***");
        System.out.println("***Press 3 to terminate the program***");
}
}



