package Donem1;

import java.util.Scanner;

public class Dob {
    
    public static void main(String args[]){
   
        Scanner Scan = new Scanner(System.in);
        
        int a;
        while(true){
        System.out.println("Please enter your age");
        a=Scan.nextInt();
        
        System.out.println(DobCalculator(a));
    }
}
    
    public static int DobCalculator(int a){
    
return 2018 - a;    
    }
    
}