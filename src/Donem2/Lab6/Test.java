
package Donem2.Lab6;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student first= new Student(1,"Ali", 25.0);
        Student second = new Student(2,"Ahmet", 56.0);
        Student third = new Student (3,"Kenan",89.0);
        Student fourth = new Student();
        Student fifth = new Student(5,"Kemal",96.0);
        
        ArrayList<Student> stList1 = new ArrayList<Student>();
        stList1.add(first);
        stList1.add(second);
        stList1.add(third);
        stList1.add(fourth);
        stList1.add(fifth);
        ArrayList<Lecture> lcList = new ArrayList<Lecture>();
        System.out.println("Number of Lectures " +Lecture.getNumberOfLectures());
        
        Lecture lc1 = new Lecture(116,"Programing", stList1);
       
        lcList.add(lc1);
        System.out.println("Number of Lectures " +Lecture.getNumberOfLectures());
        
        int tempID;
        String tempName;
        double tempGrade;
        
        int tempLcID;
        String tempLcName;
        
        ArrayList<Student> stdList2 = new ArrayList<Student>();
        
        for(int i=0; i<2;i++){
           System.out.println("Please enter the info of new student");
            System.out.print("ID:");
            tempID= sc.nextInt();
            sc.nextLine();
            
            System.out.print("Name:");
            tempName=sc.nextLine();
            
            System.out.print("Grade:");
            tempGrade=sc.nextDouble();
            
            Student tempStudent = new Student(tempID,tempName,tempGrade);
            
            stdList2.add(tempStudent);
            System.out.println("Student is registered succesfully!");
        }
        
        System.out.println("Pleas enter the information of the new Lecture");
        
          System.out.print("Lecture ID: ");
          tempLcID=sc.nextInt();
          sc.nextLine();
          System.out.print("Lecture name: ");
          tempLcName=sc.nextLine();
          Lecture lc2 = new Lecture(tempLcID,tempLcName,stdList2);
          lcList.add(lc2);
          System.out.println("number of lectures" + Lecture.getNumberOfLectures());
          
          System.out.println("Print data of lectures");
          for(int i=0;i<lcList.size();i++)
          {
              lcList.get(i).printLectureInfo();
          }
    }
    
}
