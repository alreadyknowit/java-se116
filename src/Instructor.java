/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @authors MrGodleSS, HighSocietyMFD, HeisenBerk29
 */
public class Instructor {
  
    
    private String name;
    private int instructorID;
    private ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    private static int instructorCounter;
    Scanner sc = new Scanner(System.in);

    public Instructor(String name, int instructorID) {
        this.name = name;
        this.instructorID = instructorID;
    }
    public Instructor(){
        this.name="Unknown Instuctor Name";
        this.instructorID=0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public static int getInstructorCounter() {
        return instructorCounter;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public void InstructorInfo()
    {
        System.out.println("Name     : " +name);
        System.out.println("ID       : " +instructorID);
      
    }
     public void InstructorSchedule()
     {
         
         System.out.printf("Days%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%n",
                 "|","Monday","|","Tuesday" ,"|", "Wendsday","|"
                 ,"Thursday","|","Friday","|");
         System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                 "09:00-09:50  |","10:00-10:50  |","11:00-11:50  |", 
                 "12:00-12:50  |","13:00-13:50  |","14:00-14:50  |","15:00-15:50  |",
                 "16:00-16:50  |", "17:00-17:50  |");
     }
     

}
