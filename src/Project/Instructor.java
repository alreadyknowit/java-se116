package Project;
import java.util.ArrayList;

/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29
 */
public class Instructor extends Users{
  
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private static int instructorCounter;

    public Instructor(String NAME, long ID, ArrayList<Instructor> instructors) {
        super(NAME, ID);
        this.instructors=instructors;
        instructorCounter=0;
    }
    public Instructor()
    {
        
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
        System.out.println("Name     : " +getName());
        System.out.println("ID       : " +getID());
      
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
