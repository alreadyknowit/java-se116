package Donem1;


import java.util.Scanner;
import javax.script.ScriptEngine;


public class Deneme {
     
      Scanner scan = new Scanner(System.in);
      
         public static void main(String args[]){
            
             Scanner a = new Scanner(System.in);
             int yas1;
             int yas2;
             while(true){
             System.out.println("Enter the first person's age");
            yas1= a.nextInt();
            
            System.out.println("Enter the second person's age");
            yas2= a.nextInt();
            
             System.out.println(yasFarkı(yas1, yas2));
             }
         }
         
public static int yasFarkı(int yas1, int yas2 ){
  
  if( yas1<=yas2)
      
      return yas2 - yas1;
  else
      return yas1 - yas2;
  
}
}