package Donem1;

import java.util.Scanner;

public class CompundIntererst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double interest = 0.23;
        System.out.println("Enter the money you have");
       double mainMoney =input.nextLong();
        double term =0;
     
        System.out.println("Enter the month");
        int month = input.nextInt();
        for(int i=1; i<=month;i++){
           
  term=mainMoney*interest;
 mainMoney=term+mainMoney;
        }
        System.out.println(mainMoney);
        }
}