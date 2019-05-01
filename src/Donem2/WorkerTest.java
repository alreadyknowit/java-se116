
package Donem2;



/*
AYNI OBJEYİ İKİ DEFA PRİNT EDİYOR OUTPUTTA!!!
*/
import java.util.Scanner;

public class WorkerTest {
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of workers:");
        int size =s.nextInt();
        
         Worker array[]= new Worker[size];
         
         int tempID;
         double tempSal;
         String name, desc=null;
         boolean tempMaster;
         Worker work = new Worker();
         
         for(int i=0; i<array.length; i++)
         {
             System.out.println("Please enter worker's information...");
             
             System.out.print("Name: ");
             name =s.next();
             work.setFullName(name);
             s.nextLine();
             
             System.out.print("Worker ID: ");
             tempID=s.nextInt();
             work.setWorkerID(tempID);
             
             System.out.print("Salary: ");
             tempSal=s.nextDouble();
             s.nextLine();
             work.setMonthlySalary(tempSal);
            
             
             System.out.print("Job Description: ");
             desc=s.nextLine();
             work.setJobDescripton(desc);
             
             System.out.print("Is the worker master Y/N?");
             tempMaster=s.nextBoolean();
             
             work.setMaster(tempMaster);
             
             array[i]=work;
         }
         System.out.println("Printing Information...");
         displayWorkerInfo(array);
         
       
         searchJobDescripton(array, desc);
         //maxAnnualSalariedWorker(array);
         
        
    }
    public static void displayWorkerInfo(Worker[] workers)
    { 
        for(int i=0; i<workers.length;i++) 
        {
                  
        System.out.println("WORKER INFO");
        System.out.println("-----------");
        System.out.println("ID             : " + workers[i].getWorkerID());
        System.out.println("NAME           : " + workers[i].getFullName());
        System.out.println("MONTHLY SALARY : " +workers[i].getMonthlySalary());
        System.out.println("ANNUAL SALARY  : " +workers[i].calculateAnnualIncome());
        System.out.println("JOB DESC.      : " +workers[i].getJobDescripton());
        }
       
   }
    public static void maxAnnualSalariedWorker(Worker[] workers)
    {
        Worker max=workers[0];
        for(int i=0; i<workers.length; i++)
        {
            if(workers[i].calculateAnnualIncome()>max.calculateAnnualIncome())
            {
                max=workers[i];
            }
            else
                System.out.println("No worker found!");
                
        }
        
                   
        System.out.println("INFO OF THE WORKER WİTH HİGHEST SALARY");
        System.out.println("-----------");
        System.out.println("ID             : " + max.getWorkerID());
        System.out.println("NAME           : " + max.getFullName());
        System.out.println("MONTHLY SALARY : " + max.getMonthlySalary());
        System.out.println("ANNUAL SALARY  : " + max.calculateAnnualIncome());
        System.out.println("JOB DESC.      : " + max.getJobDescripton());  
    }
    
    public static void searchJobDescripton(Worker[] list, String key)
    {
        Scanner s = new Scanner(System.in);
         
        System.out.println("Please enter a value to search");
         key=s.nextLine();
         
        for(int i=0; i<list.length; i++)
        {
            if(list[i].getJobDescripton().contains(key))
        System.out.println("INFO OF THE WORKER WHO HAS BEEN SEARCHED");
        System.out.println("-----------");
        System.out.println("ID             : " + list[i].getWorkerID());
        System.out.println("NAME           : " + list[i].getFullName());
        System.out.println("MONTHLY SALARY : " + list[i].getMonthlySalary());
        System.out.println("ANNUAL SALARY  : " + list[i].calculateAnnualIncome());
        System.out.println("JOB DESC.      : " + list[i].getJobDescripton());  
        }
    }
    

}
