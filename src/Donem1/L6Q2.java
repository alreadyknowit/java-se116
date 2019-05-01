package Donem1;

import java.util.Scanner;

  public class L6Q2{

public static void main(String args[]){
    
    Scanner a= new Scanner(System.in);
   
     int degree=0;
     int hCounter=0;
     int pCounter=0;
     int cCounter=0;
     
     while(degree != -1000){
  
         System.out.println("Enter a degree value in Celcius");
        degree=a.nextInt();
        System.out.println("=================================================");
         if(degree>=30){
             System.out.println(degree+ " is a hot day");
         hCounter++;
         }
         else if(degree<30 && degree>16){
             System.out.println(degree + " is a pleasant day");
         pCounter++;
         }
         else if(degree<17){
             System.out.println(degree + " is a cold day be careful baby!");
             cCounter++;    
         }
         
         }
     System.out.println("=================================================");
         System.out.println("Number of hot day: "+hCounter);
         System.out.println("Number of pleasant day: "+cCounter);
         System.out.println("Number of cold dasys: " + cCounter);
}
  }
