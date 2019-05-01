package Donem1;

import java.util.Scanner;
 
     public class PrepExam2 {
             
         public static void main(String[] args) {
             
             Scanner input = new Scanner(System.in);
             
        System.out.println("Enter a begining value");
        int k =input.nextInt();
        System.out.println("Enter an end value");
        int m = input.nextInt();
        int term =0;
        int sum = 0;
             for( ;k<=m ;k++){
                 
                 term = k + (10-k)*(10-k);
                 sum = sum +term;
                 
                 System.out.println(sum);
             }
           
         }
}
