package Donem1;

import java.util.Scanner;

public class Years {
    
    public static void main(String args[]){
        Scanner a= new Scanner(System.in);
    while(true){
        int cYear = 2018;
        int cMonth = 11;
        int cDay = 25;
        int day;
        int month;
        int year;
        int yyyy=0;
        int mm=0;
        int dd=0;
        
        System.out.println("Please enter your birth day in order day, month, and year" );
        System.out.println("day:");
        day= a.nextInt();
        System.out.println("month:");
        month= a.nextInt();
        System.out.println("year: ");
        year= a.nextInt();
        
       yyyy=cYear - year;
       
       if(cYear<year)
            System.err.println("Enter a valid date");
            
       else{
        if(month>12)
               System.err.println("Enter a valid month");
        else{
            if(day>30)
                System.err.println("Enter a valid day");
            else{
       if(cMonth>=month)
       {
           mm = cMonth - month;
            if(day<=cDay)
             
               dd=day;
           
           else if(day>cDay)
            mm = mm-1;
            dd = cDay - day;
            
          
       }
       else if(cMonth<month)
       {
            yyyy =yyyy - 1;
           mm= cMonth;
           dd= cDay;
           
           
                    
                         }
           
        
               }
       
       
          System.out.println(yyyy + " yıl " + mm +" ay " + dd +  " gün oldu.");
                  
       }
       }
    }
    }
    }

