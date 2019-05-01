
package Donem2.Lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer {
    private int lecturerID;
    private String lecturerName;
    private ArrayList<Student> myStudents  = new ArrayList<Student>();
    
    public Lecturer()
    {
        lecturerID=0;
        lecturerName=null;
        myStudents=null;
    }
      public Lecturer(int ID, String name)
    {
        this.lecturerID=lecturerID;
        this.lecturerName=lecturerName;
    }
    

    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public ArrayList<Student> getMyStudentst() {
        return myStudents;
    }

    public void setMyStudents(ArrayList<Student> myStudents) {
        this.myStudents = myStudents;
    }
   
   public void AddStudent(ArrayList<Student> myStudent)
    {
        Scanner sc = new Scanner(System.in);
        int n=0;
         int counter=0;
            while(n==0)
            {
            Student st = new Student();
           
            System.out.print("Full Name:");
            st.setFullName(sc.nextLine());
          
            sc.nextLine();
            
            System.out.print("ID:");
            st.setID(sc.nextInt());
            
            System.out.print("Grade:");
            st.setGrade(sc.nextDouble());
            
            System.out.println("If you want to exit click 1 ");
                if(sc.nextInt()==1)
                {
                    n=1;
                }
               
                counter++;
         }
    }
    public void PrintStudent(ArrayList<Student> st)
    {
       Scanner sc= new Scanner(System.in) ;
        Student obj = new Student();
        int counter=st.size();
        while(true)
        {
            System.out.print("Full Name  : ");
            obj.getFullName();
            sc.nextLine();
            
            System.out.print("ID         : ");
            obj.getID();
            sc.nextLine();
            
            System.out.print("Grade      : ");
            obj.getGrade();
            sc.nextLine();
            counter++;
            
        }
           
        
    }
    
    
}
