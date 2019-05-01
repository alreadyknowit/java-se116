package Donem1;

import java.util.Scanner;

public class L5Q2{
    
    public static void main(String args[]){
        
        Scanner x=new Scanner(System.in);
        
        int deg;
        String a=" is a cold day";
       
        
       System.out.println("Please enter a degrere value(in Celcius)");
       deg=x.nextInt();
       
       if(deg>29)
           System.out.println(deg + " is a hot day");
       
       else if (deg>=17 && deg<=29)
           System.out.println(deg + "is a pleasant day");
            
       else if(deg<17)
           System.out.print(deg + a);
    }
       
}