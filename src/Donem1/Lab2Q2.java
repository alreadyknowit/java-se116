package Donem1;



import java.util.Scanner;

public class Lab2Q2 {

    public static void main(String[] args){
        
        Scanner a= new Scanner(System.in);
        
            int AA_Counter=0;
            int BB_Counter=0; 
            int CC_Counter=0;
            int DD_Counter=0;
            int FF_Counter=0;
            double avg;
            int score;
            int total = 0;
            
           
            for(int i=0; i<25; i++){
                
            System.out.println("Enter a student's grade");
            score=a.nextInt();
             total=score+total;
                
                if(score>90 && score<100)
                    AA_Counter++;
                  
                  else if(score>70)
                      BB_Counter++;
           
                  else if(score>60)
                      CC_Counter++;
                  
                  else if(score>=50)
                     DD_Counter++;
                  
                  else if(score<50)
                    FF_Counter++;
                  
                 else
                        System.out.println("You entered wrong grade");
                
            }
            
              
             avg=total/25;
  
         
               System.out.println("Average grade of class " + avg);
               
             if(avg>90){
                   System.out.println("Average grade of class AA");
             }else if(avg>70)
                  System.out.println("Average grade of class BB");
                           else if(avg>60)
                  System.out.println("Average grade of class CC");
                           else if(avg>=50)
                  System.out.println("Average grade of class DD");
                           else if(avg<50)
                  System.out.println("Average grade of class FF");
             
             
             
             System.out.println(AA_Counter + " of students got AA");
             System.out.println(BB_Counter + " of students got BB");
             System.out.println(CC_Counter + " of students got CC");
             System.out.println(DD_Counter + " of students got DD");
             System.out.println(FF_Counter + " of students got FF");
                                  

    }}
    

