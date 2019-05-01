package Donem1;


import java.util.Scanner;

public class Lab3Q1a {
    
  
    public static void main(String[] args){
 
    Scanner input= new Scanner(System.in);
    
    int num;
    int min;
   
       
    System.out.println("Read a number ");
    min=input.nextInt();
    
    for(int i=0; i<10; i++){
     
    System.out.println("Read a number");
     num=input.nextInt();
     
     
    if(num<min)
       min=num;
    
}
    System.out.println("The min value is " +min);

    }
      
        }
    
    
    

    
   
