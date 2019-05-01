package Donem1;

 import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
   
    boolean isNumberPrime = true;
     Scanner a = new Scanner(System.in);
        int number;
    
        System.out.println("Enter a number to check whether it is a prime number or not.");
        number= a.nextInt();
        
        for(int i=2;i<number; i++)
        {
            if(number%i ==0){
                isNumberPrime = false;
            break;}
        }
   if(isNumberPrime ==true){
            System.out.println(number+" is a prime number");}
   else{
            System.out.println(number + " is  not a prime number");}
    
    }
    
}
