/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Godless Chicken
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Animal a1 = new Animal();
        a1.printAllData();
        
        Duck d2 = new Duck();
        d2.printAllData();
        
        String tempName;
        int tempAge,tempNumberOfLegs,legthOfBeard;
        System.out.println("Duck Info");
        System.out.println("Name: ");
        tempName=sc.nextLine();
        
        System.out.println("Age: ");
        tempAge=sc.nextInt();
        
        System.out.println("Number Of Legs:");
        tempNumberOfLegs=sc.nextInt();
        sc.nextLine();
                
        
        Duck d1 = new Duck(tempName,tempAge,tempNumberOfLegs);
        d1.printAllData();
        
        System.out.println("Dog Info");
        System.out.println("Name: ");
        tempName=sc.nextLine();
        
        System.out.println("Age: ");
        tempAge=sc.nextInt();
        
        System.out.println("Number Of Legs:");
        tempNumberOfLegs=sc.nextInt();
        sc.nextLine();
        Dog dog1 = new Dog(tempAge,tempName,tempNumberOfLegs);
        dog1.printAllData();
        
        
        System.out.println("Goat Info");
        System.out.println("Name: ");
        tempName=sc.nextLine();
        
        System.out.println("Age: ");
        tempAge=sc.nextInt();
        
        System.out.println("Number Of Legs:");
        tempNumberOfLegs=sc.nextInt();
        
        System.out.println("Legth Of Beard: ");
        legthOfBeard=sc.nextInt();
        Goat g1 = new Goat(legthOfBeard,tempName,tempAge,tempNumberOfLegs);
        g1.printAllData();
    
        
    }
}
