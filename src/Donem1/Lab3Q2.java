package Donem1;

import java.util.Scanner;

public class Lab3Q2 {
    
    public static void main(String args[]){
      
        Scanner input= new Scanner(System.in);
        
        int num;
        String result= "no";
        for(int i=0; i<10; i++){
            System.out.println("Read a number");
            num=input.nextInt();
            
            if(num==51)
                result="yes";
             }
           System.out.println("The answer of the question " + result);
                
              
    }
}