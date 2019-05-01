package Donem1;

import java.util.Scanner;

  public class L6Q1 {
       
      public static void main(String args[]){
      
      Scanner input= new Scanner(System.in);
      
      int a;
      
      
      while(true){
          int fact=1;
      System.out.println("Get a number ");
            a=input.nextInt();
            
           for(int i=1; i<=a; i++){
               
               fact=fact*i;
           }
               
            
            
            
            System.out.println("The factorial of number is: " + fact);
      }
            
            
            
      
      }
      
  }