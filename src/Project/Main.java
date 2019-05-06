package Project;
import java.util.Scanner;

/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loopTerminate=true;
        int switchValue=0;
        
        while(true)
        {
            
            System.out.println("===Select User===");
            System.out.printf("%s%n%s%n%s%n"," 1-Admin"," 2-Instructor"," 3-Student");
            System.out.print("Your choice:");
            String choice =sc.nextLine();
            System.out.println();
           
           if(choice.equals("admin")||choice.equals("Admin")||choice.equals("1"))
           {
               switchValue=1;
           }
           else if(choice.equals("instructor")||choice.equals("Instructor")||choice.equals("2"))
           {
               switchValue=2;
           }
           else if(choice.equals("student")|| choice.equals("Student")||choice.equals("Students")
                   ||choice.equals("students") || choice.equals("3"))
           {
               switchValue=3;
           }
          
            switch(switchValue)
            {
                case 1:
                   
                     while(loopTerminate)
                   {
                    Admin admin = new Admin();
                    adminDisplayMenu();
                    int adminChoice=sc.nextInt();
                    
                       switch(adminChoice)
                    {
                        case 1:
                            admin.setAdminInfo();
                            break;
                        case 2:
                            admin.StudentRegistration();
                            break;
                        case 3:
                            admin.displayStudentList();
                            break;
                        case 4:
                            admin.studentDelete();
                            break;
                        case 5:
                            admin.updateStudentsInfo();
                            break;
                        case 6:
                            admin.AddLectures();
                            break;
                        case 7:
                            admin.printLectures();
                            break;
                        case 8:
                            admin.updateLectureInfo();
                            break;
                        case 9:
                            admin.InstructorRegistration();
                            break;
                        case 0:
                            //Admin menüsünden çıkarken bir kere boş geçiyor
                            loopTerminate=false;
                            break;
                        default:
                            System.out.println("There is no such option.Try again...");
                            break ;

                    }
                   }
                    break;

                case 2:
                    instructorDisplayMenu();
                    break;

                case 3:
                    studentDisplayMenu();
                    break;

                default:
                      System.out.println("2There is no such option please try again...");
                      break;
            }

            }


    }
    public static void adminDisplayMenu()
    {        System.out.println("========================================");
             System.out.println("*********Welcome to admin menu**********");
             System.out.println("========================================");
             System.out.println();
             System.out.println("****************************************");
             System.out.println("* Here are the admin menu options[1,9] *");
             System.out.println("* Admin Profile(1)                     *");
             System.out.println("* Student Registration(2)              *");
             System.out.println("* Students List(3)                     *");
             System.out.println("* Student Delete(4)                    *");
             System.out.println("* Update Student Information(5)        *");
             System.out.println("* Add Lecture(6)                       *");
             System.out.println("* Display Lectures(7)                  *");
             System.out.println("* Update Lecture Information(8)        *");
             System.out.println("* Instructor Registration(9)");
             System.out.println("* Exit Admin Menu(0)                   *");
             System.out.println("****************************************");
             System.out.println();
             System.out.print("Your choice2:");

    }
    public static void mainMenu(){}
    public static void instructorDisplayMenu() {
            Scanner s = new Scanner(System.in);
            System.out.println("========================================");
            System.out.println("*********Welcome to the Instructor menu**********");
            System.out.println("========================================");
            System.out.println();
            System.out.println("****************************************");
            System.out.println("----Please enter ID to continue----");
            long tempID = s.nextLong();
            for (int i = 0; i < Admin.instructors.size(); i++) {
                if (Admin.instructors.get(i).getID() == tempID) {
                    System.out.println("Login Successful");
                }
            }}
            public static void studentDisplayMenu(){
                Scanner s =new Scanner(System.in);
                System.out.println("========================================");
                System.out.println("*********Welcome to the Student menu**********");
                System.out.println("========================================");
                System.out.println();
                System.out.println("****************************************");
                System.out.println("----Please enter ID to continue----");
                long tempID = s.nextLong();
                for (int i = 0; i < Admin.students.size(); i++) {
                    if (Admin.students.get(i).getID() == tempID) {
                        System.out.println("Login Successful");
                        System.out.println("Here are the student menu options[]");
                        System.out.println("1)Show Grades");
                        System.out.println("=============================");
                        if (s.nextInt() == 1) {
                            System.out.println("Please select the lecture for your grades");
                            for (int y = 0; y < Admin.lectures.size(); y++) {
                                System.out.println((y + 1) + ") " + Admin.lectures.get(y).getLectureName());
                            }
                            for (int y = 0; y < Admin.lectures.size(); y++) {

                            }
                        }
                    }
                    else {
                        System.out.println("ID not found!!!");
                        break;
                    }
                }


            }
    }