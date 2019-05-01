
package Donem2.Lab5;

import java.util.Scanner;

public class Test {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars[] array = new Cars[2];
       
        
            int modelY, cylnd;
            String model;
            double price,topSpeed, volume;
            
             
        for(int i=0; i<array.length; i++)
        {
             Cars car =new Cars();
            System.out.print("Model year:");
            modelY=sc.nextInt();
            car.setModelYear(modelY);
            
            System.out.print("Model:");
            model=sc.next();
            sc.nextLine();
            car.setModel(model);
            
            System.out.print("Top speed:" );
            topSpeed=sc.nextDouble();
            car.setTopSpeed(topSpeed);
            
            System.out.print("Price:");
            price=sc.nextDouble();
            car.setPrice(price);
            
            System.out.print("Volume:");
            volume=sc.nextDouble();
            car.getEng().setVolume(volume);
            
            System.out.print("Cylinders: ");
            cylnd=sc.nextInt();
            car.getEng().setCylinders(cylnd);
            array[i]=car;
          
        }
        
      Cars.PrintInfo(array);
        
        
    }
    
     
    
    
}
