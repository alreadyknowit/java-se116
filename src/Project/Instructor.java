package Project;
import java.util.ArrayList;

/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29
 */
public class Instructor extends Users{
  

    private static int instructorCounter;

    private String Lecture;
    private String Faculty;
    private int YearofStarting;

    public Instructor(String NAME, long ID,String Lecture,String Faculty,int YearofStarting) {
        super(NAME, ID);
        this.Lecture=Lecture;
        this.Faculty=Faculty;
        this.YearofStarting=YearofStarting;
        instructorCounter=0;
    }

    public String getFaculty() {
        return Faculty;
    }

    public int getYearofStarting() {
        return YearofStarting;
    }

    public static int getInstructorCounter() {
        return instructorCounter;
    }


    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public void InstructorInfo()
    {
        System.out.println("Name     : " +getName());
        System.out.println("ID       : " +getID());
      
    }
     public void InstructorSchedule()
     {
         
         System.out.printf("Days%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%n",
                 "|","Monday","|","Tuesday" ,"|", "Wednesday","|"
                 ,"Thursday","|","Friday","|");
         System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                 "09:00-09:50  |","10:00-10:50  |","11:00-11:50  |", 
                 "12:00-12:50  |","13:00-13:50  |","14:00-14:50  |","15:00-15:50  |",
                 "16:00-16:50  |", "17:00-17:50  |");
     }
    

}
