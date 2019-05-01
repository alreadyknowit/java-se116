package Donem1;

import java.util.Scanner;

public class PrepExam {
       
        public static void main(String args[]){
            Scanner a = new Scanner(System.in);
      
            int result = 0;
            int term = 0;
            int sum= 0;
                    for(int k=4 ; k<=9 ;k++){
                        
                        
                        term= k + (10-k)*(10-k);
                        sum = sum + term;
                    }
       System.out.println(sum);
        }           
}
