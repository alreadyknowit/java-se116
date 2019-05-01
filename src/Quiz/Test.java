/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import java.util.Scanner;

/**
 *
 * @author Godless Chicken
 */
public class Test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
       
        
        System.out.println("Enter player info:");
        
        while(true)
        {
             String tempName;
        int tempAge,tempBackNumber,tempTall;
        System.out.print("Name: ");
        tempName=sc.nextLine();
        
        System.out.print("Back Number: ");
        tempBackNumber=sc.nextInt();
        
        System.out.print("Age: ");
         tempAge=sc.nextInt();
         
         System.out.print("Tall: ");
         tempTall=sc.nextInt();
         sc.nextLine();
        
       BasketballPalyer player1 = new BasketballPalyer(tempName,tempBackNumber,tempAge,tempTall);
       player1.printInfo();
       
       System.out.println("Do you want to continue yes/no?");
       String response =sc.nextLine();
       if(response.equals("no") || response.equals("No"))
           break;
       else{
           System.out.println("Continue...");
       }
            
        }
        
    }
    
}
