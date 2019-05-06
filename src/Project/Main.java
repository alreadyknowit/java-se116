package Project;
import java.util.ArrayList;
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
                            admin.InstructorRegistration();
                            break;
                        case 9:
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
             System.out.println("* Instructor Registration(8)           *");
             System.out.println("* Exit Admin Menu(9)                   *");
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
                    System.out.println("Here are the Instructor menu options[]");
                    System.out.println("Press 1 to enter Student Grades");
                    System.out.println("=============================");
                    if (s.nextInt() == 1){
                        if(Admin.instructors.get(i).getID()==tempID && Admin.instructors.get(i).getFaculty().equals("Engineering")){
                            System.out.println("Engineering grade system");

                        }

                    }
                }
            }
    }

    public static void studentDisplayMenu(){
        ArrayList<Lecture> selectedLectures=new ArrayList<>();
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
                System.out.println("2)Lecture Registration");
                System.out.println("=============================");
                int select=s.nextInt();
                if (select == 1) {
                    System.out.println("Please select the lecture for your grades");
                    for(i=0;i<Admin.students.size();i++){
                        if(Admin.students.get(i).getDepartment().equals("Engineering")){
                            for(int x=0;x<Admin.engineeringLectures.size();x++)
                            System.out.println((x+1)+") "+Admin.engineeringLectures.get(x));
                        }
                        else if(Admin.students.get(i).getDepartment().equals("Medicine")){
                            for(int x=0;x<Admin.medicineLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.medicineLectures.get(x));
                        }
                        else if(Admin.students.get(i).getDepartment().equals("Art")){
                            for(int x=0;x<Admin.artLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.artLectures.get(x));
                        }
                        else if(Admin.students.get(i).getDepartment().equals("Business")){
                            for(int x=0;x<Admin.businessLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.businessLectures.get(x));
                        }
                        else if(Admin.students.get(i).getDepartment().equals("Law")){
                            for(int x=0;x<Admin.lawLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.lawLectures.get(x));
                        }
                    }}
                else if(select==2) {
                    System.out.println("Please select the lectures you want to take");
                    for(i=0;i<Admin.students.size();i++){
                        if(Admin.students.get(i).getFaculty().equals("Engineering")){
                            for(int x=0;x<Admin.engineeringLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.engineeringLectures.get(x).getLectureName()+"--->"
                                        +Admin.engineeringLectures.get(x).getLectureID());
                            System.out.println("Choose your lectures");
                            System.out.println("Press 0 to stop selecting");
                            while(true){
                                int x=s.nextInt();
                                if(x==0){
                                    break;
                                }
                                selectedLectures.add(Admin.engineeringLectures.get(x-1));
                            }
                        }
                        else if(Admin.students.get(i).getFaculty().equals("Medicine")){
                            for(int x=0;x<Admin.medicineLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.medicineLectures.get(x).getLectureName()+"--->"
                                        +Admin.medicineLectures.get(x).getLectureID());

                            while(true){
                                int x=s.nextInt();
                                if(x==0){
                                    break;
                                }
                                selectedLectures.add(Admin.medicineLectures.get(x-1));
                            }

                        }
                        else if(Admin.students.get(i).getFaculty().equals("Art")){
                            for(int x=0;x<Admin.artLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.artLectures.get(x).getLectureName()+"--->"
                                        +Admin.artLectures.get(x).getLectureID());

                            System.out.println("Choose your lectures");
                            System.out.println("Press 0 to stop selecting");
                            while(true){
                                int x=s.nextInt();
                                if(x==0){
                                    break;
                                }
                                selectedLectures.add(Admin.artLectures.get(x-1));
                            }
                        }
                        else if(Admin.students.get(i).getFaculty().equals("Business")){
                            for(int x=0;x<Admin.businessLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.businessLectures.get(x).getLectureName()+"--->"
                                        +Admin.businessLectures.get(x).getLectureID());

                            System.out.println("Choose your lectures");
                            System.out.println("Press 0 to stop selecting");
                            while(true){
                                int x=s.nextInt();
                                if(x==0){
                                    break;
                                }
                                selectedLectures.add(Admin.businessLectures.get(x-1));
                            }

                        }
                        else if(Admin.students.get(i).getFaculty().equals("Law")){
                            for(int x=0;x<Admin.lawLectures.size();x++)
                                System.out.println((x+1)+") "+Admin.lawLectures.get(x).getLectureName()+"--->"
                                        +Admin.lawLectures.get(x).getLectureID());

                            System.out.println("Choose your lectures");
                            System.out.println("Press 0 to stop selecting");
                            while(true){
                                int x=s.nextInt();
                                if(x==0){
                                    break;
                                }
                                selectedLectures.add(Admin.lawLectures.get(x-1));
                            }

                        }

                    }
                    System.out.println();
                }
            }
            else {
                System.out.println("ID not found!!!");
                break;
            }


        }


            }
    }