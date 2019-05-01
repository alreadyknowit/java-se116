/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab6;

/**
 *
 * @author Godless Chicken
 */
public class Student {
    private int ID;
    private String fullName;
    private double grade;
    public Student()
    {
        this.ID=0;
        this.fullName="Unknown";
        this.grade=0.0;
    }
    public Student(int ID, String name, double grade)
    {
        this.ID=ID;
        this.fullName=name;
        this.setGrade(grade);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade<0.0 || grade>100.0)
                  grade=0.0;
            this.grade = grade;
    }
    public void printStudentInfo()
    {
        System.out.println("STUDENT INFO");
        System.out.println("=============");
        System.out.println("Name: " + getFullName());
        System.out.println("ID: " + getID());
        System.out.println("Grade: " +getGrade());
        System.out.println("===============");
    }
    
    
}
