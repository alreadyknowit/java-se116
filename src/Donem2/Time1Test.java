
package Donem2;

import java.util.Scanner;

public class Time1Test 
{
  
public static void main(String[] args) 
{
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Hour minute and second in order.");
    int h= input.nextInt();
    int m= input.nextInt();
    int s= input.nextInt();
       
        
        
        Time1 t = new Time1(h,m,s);
        
        displayTime("After time object is created", t);
        System.out.println();
        t.setTime(13, 27, 6);
        displayTime("After calling setTime", t);
        System.out.println();
        
    try
    {
        t.setTime(99, 99, 99);
    } 
        
   catch (IllegalArgumentException e)
   {
       System.out.printf("Exception: %s%n%n", e.getMessage());
   }
     System.out.printf("After caling setTime with invalid values",t);
}
private static void displayTime(String header, Time1 t)
{
    System.out.printf("%s%nUniversal time: %s%nStandart time: %s%n",
            header, t.toUniversString(), t.toString());
}
    
}
