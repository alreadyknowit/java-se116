package Donem1;


import java.util.Scanner;

public class L5Q1 {
    
    public static void main(String args[]){
        
        Scanner a = new Scanner(System.in);
        
        int code;
        String x="none";
        
        System.out.println("Read a country code");
        code=a.nextInt();
        
        
        switch (code){
                case 1: 
                    System.out.println("Canada");
                    break;
                    
                case 32:
                    System.out.println("Belgium");
                    break;
                    
                case 44:
                    System.out.println("United Kingdom");
                    break;
                    
                case 47:
                    System.out.println("Norway");
                    break;
                    
                case 55:
                    System.out.println("Brazil");
                    break;
                    
                case 90:
                    System.out.println("Turkey");
                    break;
                    
                case 234:  
                    System.out.println("Nigeria");
                    break;
                    
                default:
                    System.out.print(x);
                        break;
                        
                        
        
                    
        }
                
        }
}
