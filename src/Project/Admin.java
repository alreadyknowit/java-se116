package Project;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29
 */
public class Admin extends Users implements IAdmin{
    private String password;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecture> lectures= new ArrayList<>();
    
     Scanner sc = new Scanner(System.in);

    public Admin(String NAME,long ID, String password) {
        super(NAME,ID);
        
        this.password=password;
    }
    public Admin()
    {
        super("Admin",01);
        this.password="123";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }   
    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }
   
    @Override
    public  void setAdminInfo(){
      
        while(true)
        {
        System.out.print("Enter available password: ");
         if(sc.nextLine().equals(password))
         {
             System.out.print("New password: ");
             String a=sc.nextLine();
             System.out.print("New password: ");
             String b=sc.nextLine();
             if(a.equals(b))
             {
              System.out.println("The password succesfully changed.");
                 setPassword(a);
                 System.out.println(getPassword());
              break;
             }
             break;
         }
         else
             System.out.println("The password is wrong.Please try again.");
        }
    }
   
    @Override
    public void StudentRegistration()
    {
        while(true)
        {
          
    
    String tempFullName,tempDepartment,tempMailAdress;
    int tempAge,tempYearOfStarting,tempGradation;
    long tempPhoneNumber,tempID=0;
    double tempPricetoPay=0,scholarship=0;
    
         System.out.println("STUDENT REGİSTRATİON");
         System.out.println("=============");
         System.out.print("Full Name: ");
         tempFullName=sc.nextLine();


            System.out.println("Faculty:");
            System.out.println("Press 1 for Engineering!");
            System.out.println("Press 2 for Law!");
            System.out.println("Press 3 for Architecture!");
            System.out.println("Press 4 for Medicine!");
            int x=sc.nextInt();

            if(x==1|| x==2||x==3){
                System.out.println("Please enter the scholarship amount: ");
                scholarship=sc.nextDouble();
                tempPricetoPay=39750-(scholarship/100*39750);
                sc.nextLine();
            }

            else if(x==4){
                System.out.println("Please enter the scholarship amount: ");
                scholarship=sc.nextDouble();
                tempPricetoPay=52500-(scholarship/100*52500);
                sc.nextLine();
            }

         
         System.out.print("Department:");
         tempDepartment=sc.nextLine();

         
         System.out.print("Age: ");
         tempAge=sc.nextInt();

         
         System.out.print("Year Of Staring: " );
         tempYearOfStarting=sc.nextInt();

         
         System.out.print("Gradation: " );
         tempGradation=sc.nextInt();

         System.out.print("Mail: ");
         tempMailAdress=sc.next();
         
         System.out.print("Phone Number: ");
         tempPhoneNumber=sc.nextLong();
         
            Users tempStudent= new Student(tempFullName,tempDepartment,tempMailAdress,
                 tempAge,tempYearOfStarting,tempGradation,tempID,tempPhoneNumber,tempPricetoPay,scholarship);
          students.add((Student) tempStudent);
         
         System.out.println("Student ID is determining...");
         
         //********************************DÖNGÜ SONSUZA KADAR SÜRÜYOR***************************************************************
         
         boolean continueLoop=true;
           
            while(continueLoop){
                try {
                    DetermineStudentID();
                    System.out.println("Please confirm the ID...");
         tempID=sc.nextLong();
         students.get(students.size()-1).setID(tempID);
         continueLoop=false;
                } 
                catch (ArithmeticException arithmeticException) {
                    System.err.println("Exception: " +arithmeticException);
                    System.out.println("");
                }
                catch(InputMismatchException inputMismatchException){
                    System.err.println("Exception: " +inputMismatchException);
            }
            }
            
        System.out.println("Student is registered successfully!");
           
        sc.nextLine();
         System.out.println("Do you want add more students Yes/No?");  
       
         String response=sc.nextLine();
            if(response.equals("N") 
                    || response.equals("n")
                    || response.equals("No")
                    || response.equals("no"))
            {
                 break ;
            }
            else if(response.equals("Y") 
                    || response.equals("y")
                    || response.equals("Yes")
                    || response.equals("yes"))
            {
                 System.out.println("Continue...");
            }
           
        }
         
    }
    @Override
    public void displayStudentList()
    {
        System.out.println("Here ara all the students:");
        for(int i=0;i<this.getStudents().size();i++)
        {
            //Student listesi boş is belirtsin
            System.out.println("");
            System.out.println("Student#"+(i+1)+" Profile");
            System.out.println("=============");
            this.getStudents().get(i).studentPrint();
        }
    }
    
    @Override
    public void studentDelete()
    {
        System.out.println("Which students do you want to delete(enter profile order)");
        getStudents().remove(sc.nextInt()-1);
        System.out.println("Student is removed successfully!");
        
        displayStudentList();
        
    }
    
    @Override
    public void updateStudentsInfo()
    {
         System.out.print("Student ID: ");
         long keyword=sc.nextLong();
      
       for(int i=0;i<students.size();i++)
       {
           if(keyword==students.get(i).getID())
           {
              students.get(i).studentPrint();
              
              StudentRegistration();
           }
           else
               System.out.println("There is no such ID");
       }
   }
    
    @Override
    public void DetermineStudentID()
    {
       
    
       Student obj = new Student();
      
       label: while(true)
        {
        switch(students.get(students.size()-1).getDepartment())
        {
                 case "Computer Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "010"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Software Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "020"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Industrial Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "030"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Medicine":
               System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "040"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Architecture":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "050"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Psychology":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "110"+ students.get(students.size()-1).getGradation());
                 break label ;
            case  "Law" :
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "120"+ students.get(students.size()-1).getGradation());
                break label;
            case "Bussines and Managment":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "130"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Economics":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "140"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Media and Communication":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "210"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Bussiness":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "220"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Public Relations and Advertising":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "230"+ students.get(students.size()-1).getGradation());
                 break  label;
            default:
                System.out.println("Oops!Something went wrong.ID could not be determined(Check the department)");
                System.out.print("Department: ");
                students.get(students.size()-1).setDepartment(sc.nextLine());
                break;
        }
        }
    } 
    
    @Override
   public void AddLectures()
   {
        
      String response;
       while(true)
        {
            Lecture lc = new Lecture();
          System.out.print("Lecture name: ");
          lc.setLectureName(sc.nextLine());
          System.out.print("Lecture ID: ");
          lc.setLectureID(sc.nextLine());
         
          lectures.add(lc);
         
          System.out.println("Lecture added successfully!");
         
          System.out.println("Do you want to add more lecture?");
          
          response=sc.nextLine();
            if(response.equals("N") 
                    || response.equals("n")
                    || response.equals("No")
                    || response.equals("no"))
            {
                 break ;
            }
            else if(response.equals("Y") 
                    || response.equals("y")
                    || response.equals("Yes")
                    || response.equals("yes"))
            {
                 System.out.println("Continue...");
            }
        }
    }
   
    @Override
   public void printLectures()
   {
       Lecture lc = new Lecture();
       System.out.println("            >>>LECTURES LİST<<<");
       
       for(int i=0;i<lectures.size();i++)
       {    
           System.out.println("Lecture#"+(i+1));
           lectures.get(i).LectureInfo();
       }
   }
   
    @Override
   public void updateLectureInfo()
   {
       System.out.print("Lecture ID: ");
       String keyword=sc.nextLine();
      
       for(int i=0;i<lectures.size();i++)
       {
           if(keyword.equals(lectures.get(i).getLectureID()))
           {
              lectures.get(i).LectureInfo();
              
            System.out.println("Please reset your information");
               
                System.out.print("Name : ");
                lectures.get(i).setLectureName(sc.nextLine());
                System.out.print("Lecture ID:");
                lectures.get(i).setLectureID(sc.nextLine());
           
           }
           else
               System.out.println("There is no such ID");
       }
   }
   
}


