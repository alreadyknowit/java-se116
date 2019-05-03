

package Project;

/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk
 */

public class Student extends Users{
    
   private String department,mailAdress;
   private int age,yearOfStarting,gradation;
   private long phoneNumber;
   private double priceToPay,scholarship;
  
  
   private static int studentCounter;

    public Student(String NAME, String department, String mailAdress, int age,
            int yearOfStarting, int gradation, long ID, long phoneNumber, double priceToPay,double scholarship) {
        super(NAME,ID);
        this.department = department;
        this.mailAdress = mailAdress;
        this.age = age;
        this.yearOfStarting = yearOfStarting;
        this.gradation = gradation;
        this.phoneNumber = phoneNumber;
        this.priceToPay=priceToPay;
        this.scholarship=scholarship;
    }
    
   
   public Student()
   {
         super("NoName",0);
        this.department = "No deparment";
        this.mailAdress = "No mail";
        this.age = 0;
        this.yearOfStarting = 0;
        this.gradation = 0;
        this.phoneNumber =0;
        this.priceToPay=0;
       
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

    public void setAge(int age){
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
         System.out.println("Name: " +getName());
         System.out.println("ID: " +getID());
         System.out.println("Department: " +department);
         System.out.println("Age: " +age);
         System.out.println("Year Of Staring: " +yearOfStarting);
         System.out.println("Gradiation: " +getGradation());
         System.out.println("Mail: " +mailAdress);
         System.out.println("Phone Number: " +phoneNumber);
         System.out.println("Scholarship: %"+scholarship);
         System.out.println("Price to pay: "+priceToPay);
     }
    
}
