package Donem1;


import java.util.Scanner;
import java.util.Arrays;

public class VarargsTest {
        Scanner input = new Scanner(System.in);
    
    public  double average(double ... numbers)
    {
        System.out.println("Enter student number");
        int n;
            n = input.nextInt();
        n= numbers.length;
        
        for(int i =0;i<numbers.length; i++)
        {
        System.out.println("Enter student notes");
        int notes=input.nextInt();
        Arrays.fill(numbers, notes);
        
        }
        double total =0;
     for( double d : numbers)
         total +=d;
     
     
        System.out.println(total/numbers.length);
     
        return total/numbers.length;
 }
    
   
    public static void main(String[] args) {
        
        
    VarargsTest obj = new VarargsTest();
    obj.average();
    

    }
    
}
