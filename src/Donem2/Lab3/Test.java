
package Donem2.Lab3;
import Donem2.Lab3.Patient;
import java.util.Scanner;
public class Test {
    
    
    
    public static void main(String[] args) {
        final int SIZE =5; 
        int choice;
        Patient PatientList[]= new Patient[SIZE];
        
        Scanner input = new Scanner(System.in);
        
       
        while(true){
             displayMenu();
            choice=input.nextInt();
            switch(choice)
        {
         case 1:
             storeInformatian(PatientList);
             break;
             
         case 2:
             printArray(PatientList);
             break;
         
         case 3:
             System.out.println("Terminating the program...");
             
             System.exit(0);
             
        }
    }        
        
    }
    
    static void displayMenu()
    {
        System.out.println("***Enter 1 to store info***");
        System.out.println("***Enter 2 to print info***");
        System.out.println("***Enter 3 to exit the program***");
        System.out.print("Your choice:");
        
        
    }
     static void storeInformatian(Patient patients[])
    {
        int tempID, tempAge;
        String tempFullName, tempDiagnosis;
         
        Scanner sc = new Scanner(System.in);
       
         boolean control = true;
         for(int i=0; i<patients.length;i++)
         {
             if(patients[i]==null)
             {
                 control=false;
             break;
         }
         }
         if(control==true)
         {
            System.out.println("Array is full!");
            return;
         
         }
         for(int i=0;i<patients.length;i++)
         {
             if(patients[i]==null)
             {
                 Patient pat = new Patient();
                 
                 System.out.println("Please enter Patient's information...");
                 
                 System.out.print("Full Name: ");
                 tempFullName=sc.nextLine();
                 pat.setFullName(tempFullName);
                 
                 
                 System.out.print("ID: ");
                 tempID=sc.nextInt();
                 pat.setPatientID(tempID);
                 
                 System.out.print("Age: ");
                 tempAge=sc.nextInt();
                 pat.setAge(tempAge);
                 
                 
                 System.out.print("Diagnosis: ");
                tempDiagnosis =sc.next();
                 pat.setDiagnosis(tempDiagnosis);
                 
                 patients[i]= pat;
                 break;
             }
         }
    }
     
    
     static void printArray(Patient[] patients)
     {
         /*for(Patient aPatient : patients)
         {
             if(aPatient!=null)
                 System.out.println("PATIENT INFO");
                 System.out.println("----------");
                 System.out.println("ID        : " + aPatient.getPatientID());
                 System.out.println("NAME      : " + aPatient.getFullName());
                 System.out.println("AGE       : " + aPatient.getAge());
                 System.out.println("DIAGNOSIS : " + aPatient.getDiagnosis());
                 System.out.println();
                 
         }*/
      
       /*  for(int i=0;i<patients.length;i++){
            if(patients[i]!=null){
                System.out.println("PATIENT INFO");
                System.out.println("-------");
                System.out.println("ID        : " + patients[i].getPatientID());
                System.out.println("NAME      : " + patients[i].getFullName());
                System.out.println("AGE       : " + patients[i].getAge());
                System.out.println("DIAGNOSIS : " + patients[i].getDiagnosis());
                System.out.println();
            }*/
           for(Patient aPatient : patients) {  
            if(aPatient!=null) {
                System.out.println("PATIENT INFO");
                System.out.println("-------");
                System.out.println("ID        : " + aPatient.getPatientID());
                System.out.println("NAME      : " + aPatient.getFullName());
                System.out.println("AGE       : " + aPatient.getAge());
                System.out.println("DIAGNOSIS : " + aPatient.getDiagnosis());
                System.out.println();
     }

     
     
}
     }
}