package Donem1;

import java.util.Scanner;

   public class SwapTwoNumber {
      
        public static void main(String[] args) {
            
            Scanner a = new Scanner(System.in);
            
            double first = 2.45;
            double second = 9.862;
             double temp =0.0;
            System.out.println("Before swap");
            System.out.println("The first nnumber is" + first);
            System.out.println("The second number is" + second);
            
            temp=first;
            
            first = second;
            second=temp;
            
            System.out.println("After Swap ");
            System.out.println("The first value:" + first);
            System.out.println("The second value:" + second);
            
            
            
            
       }
}
