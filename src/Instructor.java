/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Godless Chicken
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
     public void InstructorsLectures()
    {
        System.out.print("ID of Instructor:");
        
        
    }

}
