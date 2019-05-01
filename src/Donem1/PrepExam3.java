package Donem1;

import java.util.Scanner;
  
     public class PrepExam3 {
         
         public static void main(String[] args) {
             
             Scanner a = new Scanner(System.in);
             
             while(true){
             System.out.println("Enter how many number you want to multiply");
             int numbers = a.nextInt();
             int result=1;
             
            
          
        for( int i =1 ; i<=numbers ; i ++){
            
             System.out.println("Now, please enter the numbers in order.");
             int x = a.nextInt();
             
               result = x*result;
             
         }
             System.out.println("The result:" + result);
        
         }
         }
}
