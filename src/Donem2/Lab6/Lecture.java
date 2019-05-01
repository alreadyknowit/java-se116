/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Donem2.Lab6;

import java.util.ArrayList;

/**
 *
 * @author Godless Chicken
 */
public class Lecture {

    private int lectureID;
    private String lectureName;
    private ArrayList<Student> studentList;
    private static int numberOfLectures=0;

    public static int getNumberOfLectures() {
        return numberOfLectures;
    }

    public static void setNumberOfLectures(int numberOfLectures) {
        Lecture.numberOfLectures = numberOfLectures;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public Lecture()
    {
        this.lectureID=0;
        this.lectureName="Unknown";
        this.studentList=new ArrayList<>();
        numberOfLectures++;
    }
    public Lecture(int ID, String name, ArrayList<Student> stList)
    {
      lectureID=ID;
      lectureName=name;
      this.studentList=stList;
      numberOfLectures++;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public void printLectureInfo()
    {
        System.out.println("Lecture Info");
        System.out.println("===========");
        System.out.println("ID : " + getLectureID());
        System.out.println("Name: " +getLectureName());
        System.out.println("===========");
        for(int i=0;i<this.getStudentList().size();i++)
        {
           this.getStudentList().get(i).printStudentInfo();
        }
    }
   
}
