package Donem1;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Lab1Q2 {
    
   public static void main(String arg[]){
           
  
       Scanner a = new Scanner( System.in );
    
      int  num;
      int evenCounter=0;
      int oddCounter=0;
      
      for(int i=0; i<4; i++){
      System.out.println("Read a number");
      num=a.nextInt();
      
      if(num%2==0)
          evenCounter++;
      
      else
          oddCounter++;
      }
      System.out.println("Even numbers: " + evenCounter);
      System.out.println("Odd numbers:" + oddCounter);  
   }
}