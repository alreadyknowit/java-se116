package Donem1;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many of them want to display");
        int a = scan.nextInt();
        int x = 0;
        int y=1;
     int sum=0;
  
        for(int i =1;i<=a;i++){
             
          sum =x +y ;
            x=y;
          y=sum;
                  
                  
                  System.out.println(y);
        
        }
    }
}
