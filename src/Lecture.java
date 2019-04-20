/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MrGodleSS, HighSocietyMFD, HeisenBerk29
 */
public class Lecture {
    private String lectureName;
    private String lectureID;
    
     Scanner sc = new Scanner(System.in);

    public Lecture(String lectureName, String lectureID) {
        this.lectureName = lectureName;
        this.lectureID = lectureID;
    }
    public Lecture(){
        this.lectureName="Unknown Lecture Name";
        this.lectureID="X0";
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureID() {
        return lectureID;
    }

    public void setLectureID(String lectureID) {
        this.lectureID = lectureID;
    }
     
    public void LectureInfo()
    {
        System.out.println("Name     : " +lectureName);
        System.out.println("ID       : " +lectureID);
      
    }
    
    
    
}
