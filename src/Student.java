/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Godless Chicken
 */
public class Student extends Lecture{
    
   private String FullName,department,mailAdress;
   private int age,yearOfStarting,gradation;
   private long phoneNumber;
   private long ID;
  
   private static int studentCounter;

    public Student(String FullName, String department, String mailAdress, int age,
            int yearOfStarting, int gradation, long phoneNumber) {
        this.FullName = FullName;
        this.department = department;
        this.mailAdress = mailAdress;
        this.age = age;
        this.yearOfStarting = yearOfStarting;
        this.gradation = gradation;
        this.phoneNumber = phoneNumber;
        
    }
    public Student(long ID)
    {
      this.ID=ID;  
    }
   
   public Student()
   {
        this.FullName = "Unknown";
        this.department = "No deparment";
        this.mailAdress = "No mail";
        this.age = 0;
        this.yearOfStarting = 0;
        this.gradation = 0;
        this.ID = 0;
        this.phoneNumber =0;
       
   }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfStarting() {
        return yearOfStarting;
    }

    public void setYearOfStarting(int yearOfStarting) {
        this.yearOfStarting = yearOfStarting;
    }

    public int getGradation() {
        return gradation;
    }

    public void setGradation(int gradation) {
        this.gradation = gradation;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static int getStudentCounter() {
        return studentCounter;
    }
    
     public void studentPrint()
     { 
         System.out.println("Name: " +FullName);
         System.out.println("ID: " +getID());
         System.out.println("Department: " +department);
         System.out.println("Age: " +age);
         System.out.println("Year Of Staring: " +yearOfStarting);
         System.out.println("Gradiation: " +getGradation());
         System.out.println("Mail: " +mailAdress);
         System.out.println("Phone Number: " +phoneNumber);
         
        
     }
    
}
