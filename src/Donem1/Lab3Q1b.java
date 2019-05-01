package Donem1;

import java.util.Scanner;

public class Lab3Q1b {
    
    public static void main(String args[]){
        
        Scanner input= new Scanner(System.in);
        
        int num,max;
        
        System.out.println("Read a number");
        num=input.nextInt();
        max=num;
        for(int i=1; i<=9; i++){
            System.out.println( "Read a number");
            num=input.nextInt();
            
           
            
         if(num>max)
                max=num;
            
    }
    System.out.println("The maximum value is "+ max);
    
    }
}