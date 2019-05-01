package Donem1;

import java.util.Scanner;

 public class Lab3Q3 {
     
     public static void main(String args[]){
         
         Scanner input=new Scanner(System.in);
                 
       
         int num;
         int key=0;
         int keyCounter=0;
         
         System.out.println("Enter a number you want to search");
         key=input.nextInt();
         
         for(int i=0; i<10; i++){
             System.out.println("Read a number");
             num=input.nextInt();
             
             if(num==key)
                 keyCounter++;
             
                     
         }
         System.out.println("The number of key value "  + keyCounter);
     }
 }