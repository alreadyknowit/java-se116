package Project;
import java.util.Scanner;

/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29 
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
