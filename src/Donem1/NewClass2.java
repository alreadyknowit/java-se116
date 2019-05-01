package Donem1;

import java.util.Scanner;

    public class NewClass2 {
        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            
            System.out.println("***To calculate power enter 1***");
            System.out.println("***To calculate logarithm enter 2***");
            System.out.println("***To calculate absolute value enter 3***");
            System.out.println("***To calculate square root enter 4***");
            System.out.println("***To calculate max enter 5***");
            System.out.println("***To calculate sin enter 6***");
            System.out.println("***To calculate exponent enter 7***");
            
            
            System.out.println("Enter the operation you want to execute");
            int ops = scan.nextInt();
         
            
            switch(ops){
                
                case 1:
                    System.out.println("Please enter the base");
                double    a =scan.nextDouble();
                    System.out.println("Please enter the power");
                 double   b=scan.nextDouble();
                 System.out.println( a+ " power" + b + " is equal to= " + Math.pow(a,b));  
                    break;
                    
                case 2 :
                    System.out.println("Enter number that you want to take its logarithm(in base e)");
                    double c =scan.nextDouble();
                    System.out.println( " logarithm of " + c + "(in base e) is equal to= " + Math.log(c));  
                    break;
                    
                case 3:
                     System.out.println("Enter number that you want to find its absolute value");
                      double d=scan.nextDouble();
                    System.out.println("Absolute value of " +d + " is : " + Math.abs(d));
                    break;
                    
                case 4:
                        System.out.println("Enter number that you want to find its square root");
                        double e = scan.nextDouble();
                        System.out.println(Math.sqrt(e));
                         break;
                         
                case 5 :
                     int n;
                      
                 System.out.println("Enter two numbers to determine which one is larger");
                 int k =scan.nextInt();
                int l=scan.nextInt();
                
                 n =  Math.max(k,l);
                    System.out.println(n);
                    break;
                    
                
                default:
                    System.err.println("Please enter a valid option");
                    break;
                    
                    
                          
                     
                         
                   
                 
                
                
            }
   

     
        }
}
