package Project;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *@authors :
 *MrGodleSS
 *HighSocietyMFD
 *HeisenBerk29
 */
public class Admin extends Users implements IAdmin{
    private String password;
    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Lecture> allLectures=new ArrayList<>();
    public static ArrayList<Lecture> engineeringLectures= new ArrayList<>();
    public static ArrayList<Lecture> lawLectures= new ArrayList<>();
    public static ArrayList<Lecture> medicineLectures= new ArrayList<>();
    public static ArrayList<Lecture> businessLectures= new ArrayList<>();
    public static ArrayList<Lecture> artLectures= new ArrayList<>();

    public static ArrayList<Instructor> instructors=new ArrayList<>();


     Scanner sc = new Scanner(System.in);

    public Admin(String name,long ID, String password) {
        super(name,ID);

        this.password=password;
    }
    public Admin()
    {
        super("Admin",01);
        this.password="123";
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static void setEngineeringLectures(ArrayList<Lecture> engineeringLectures) {
        Admin.engineeringLectures = engineeringLectures;
    }

    public static void setLawLectures(ArrayList<Lecture> lawLectures) {
        Admin.lawLectures = lawLectures;
    }

    public static void setMedicineLectures(ArrayList<Lecture> medicineLectures) {
        Admin.medicineLectures = medicineLectures;
    }

    public static void setBusinessLectures(ArrayList<Lecture> businessLectures) {
        Admin.businessLectures = businessLectures;
    }

    public static void setArtLectures(ArrayList<Lecture> artLectures) {
        Admin.artLectures = artLectures;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    @Override
    public  void setAdminInfo(){

        while(true)
        {
        System.out.print("Enter available password: ");
         if(sc.nextLine().equals(password))
         {
             System.out.print("New password: ");
             String a=sc.nextLine();
             System.out.print("New password: ");
             String b=sc.nextLine();
             if(a.equals(b))
             {
              System.out.println("The password succesfully changed.");
                 setPassword(a);
              break;
             }
             break;
         }
         else
             System.out.println("The password is wrong.Please try again.");
        }
    }

    @Override
    public void StudentRegistration()
    {
        while(true)
        {

    String tempFullName,tempDepartment,tempMailAdress;
    int tempAge,tempYearOfStarting,tempGradation;
    long tempPhoneNumber,tempID=0;
    double tempPricetoPay=0,scholarship=0;
    String response;

         System.out.println("STUDENT REGISTRATION");
         System.out.println("=============");
         System.out.print("Full Name: ");
         tempFullName=sc.nextLine();

             while(true)
             {
             System.out.print("Faculty:");
             response=sc.nextLine();

             if(response.contains("Engineering")|| response.contains("engineering")
                    ||response.contains("law")|| response.contains("Law")
                    ||response.contains("Art")||response.contains("art")
                    ||response.contains("Business")||response.contains("business"))

             {
                System.out.print("Scholarship Amount:");
                scholarship=sc.nextDouble();
                tempPricetoPay=39750-(scholarship/100*39750);
                sc.nextLine();
                break;

            }

            else if(response.contains("medicine")||response.contains("Medicine"))
            {
                System.out.print("Scholarship amount: ");
                scholarship=sc.nextDouble();
                tempPricetoPay=52500-(scholarship/100*52500);
                sc.nextLine();
                break;
            }
            else{
                System.out.println("There is no such faculty.Try again...");
            }


             }

         System.out.print("Department:");
         tempDepartment=sc.nextLine();


         System.out.print("Age: ");
         tempAge=sc.nextInt();


         System.out.print("Year Of Staring: " );
         tempYearOfStarting=sc.nextInt();


         System.out.print("Gradation: " );
         tempGradation=sc.nextInt();

         System.out.print("Mail: ");
         tempMailAdress=sc.next();

         System.out.print("Phone Number: ");
         tempPhoneNumber=sc.nextLong();

            Users tempStudent= new Student(tempFullName,tempDepartment,tempMailAdress,
                 tempAge,tempYearOfStarting,tempGradation,tempID,tempPhoneNumber,tempPricetoPay,scholarship,null,response);
          students.add((Student) tempStudent);

         System.out.println("Student ID is determining...");
         DetermineStudentID();

         System.out.println("Please confirm the ID...");
         tempID=sc.nextLong();

         students.get(students.size()-1).setID(tempID);
        System.out.println("Student is registered successfully!");

        sc.nextLine();
         System.out.println("Do you want add more students Yes/No?");

         String response2=sc.nextLine();
            if(response2.equals("N")
                    || response2.equals("n")
                    || response2.equals("No")
                    || response2.equals("no"))
            {
                 break ;
            }
            else if(response2.equals("Y")
                    || response2.equals("y")
                    || response2.equals("Yes")
                    || response2.equals("yes"))
            {
                 System.out.println("Continue...");
            }

        }

    }
    @Override
    public void displayStudentList()
    {
        System.out.println("Here ara all the students:");
        for(int i=0;i<this.getStudents().size();i++)
        {
            System.out.println("");
            System.out.println("Student#"+(i+1)+" Profile");
            System.out.println("=============");
            this.getStudents().get(i).studentPrint();
        }
    }

    @Override
    public void studentDelete()
    {
        System.out.println("Which students do you want to delete(enter profile order)");
        getStudents().remove(sc.nextInt()-1);
        System.out.println("Student is removed successfully!");

        displayStudentList();

    }

    @Override
    public void updateStudentsInfo()
    {
         System.out.print("Student ID: ");
         long keyword=sc.nextLong();

       for(int i=0;i<students.size();i++)
       {
           if(keyword==students.get(i).getID())
           {
              students.get(i).studentPrint();

              StudentRegistration();
           }
           else
               System.out.println("There is no such ID");
       }
   }

    @Override
    public void DetermineStudentID()
    {


       Student obj = new Student();

       label: while(true)
        {
        switch(students.get(students.size()-1).getDepartment())
        {
                 case "Computer Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "010"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Software Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "020"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Industrial Engineering":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "030"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Medicine":
               System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "040"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Architecture":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "050"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Psychology":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "110"+ students.get(students.size()-1).getGradation());
                 break label ;
            case  "Law" :
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "120"+ students.get(students.size()-1).getGradation());
                break label;
            case "Business and Management":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "130"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Economics":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "140"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Media and Communication":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "210"+ students.get(students.size()-1).getGradation());
                 break label;
            case "Bussiness":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "220"+ students.get(students.size()-1).getGradation());
                 break label ;
            case "Public Relations and Advertising":
                System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                        + "230"+ students.get(students.size()-1).getGradation());
                 break  label;
            default:
                System.out.println("Oops!Something went wrong.ID could not be determined(Check the department)");
                System.out.print("Department: ");
                students.get(students.size()-1).setDepartment(sc.nextLine());
                break;
        }
        }
    }

    @Override
   public void AddLectures()
   {

      String response;
       while(true)
        {
            Lecture lc = new Lecture();

            System.out.println("Please Select which faculty's lecture will be added");
            System.out.println("==============");
            System.out.println("1)Engineering");
            System.out.println("2)Medicine");
            System.out.println("3)Law");
            System.out.println("4)Business");
            System.out.println("5)Art");
            System.out.println("==============");
            int tempselect=sc.nextInt();
            System.out.print("Lecture name: ");
            lc.setLectureName(sc.next());
            System.out.print("Lecture ID: ");
            lc.setLectureID(sc.next());
            if(tempselect==1)
                engineeringLectures.add(lc);
            else if(tempselect==2)
                medicineLectures.add(lc);
            else if(tempselect==3)
                lawLectures.add(lc);
            else if(tempselect==4)
                businessLectures.add(lc);
            else if(tempselect==5)
                artLectures.add(lc);

            allLectures.add(lc);

            System.out.println();
          System.out.println("Lecture added successfully!");
            System.out.println();

          System.out.println("Do you want to add more lectures?");

          response=sc.nextLine();
            if(response.equals("N")
                    || response.equals("n")
                    || response.equals("No")
                    || response.equals("no"))
            {
                 break ;
            }
            else if(response.equals("Y")
                    || response.equals("y")
                    || response.equals("Yes")
                    || response.equals("yes"))
            {
                 System.out.println("Continue...");
            }

        }
    }

    @Override
   public void printLectures()
   {
       Lecture lc = new Lecture();
       System.out.println("            >>>LECTURES LIST<<<");

       System.out.println("Please Select which lectures you want to display");
       System.out.println("==============");
       System.out.println("1)Engineering lectures");
       System.out.println("2)Medicine lectures");
       System.out.println("3)Law lectures ");
       System.out.println("4)Business lectures");
       System.out.println("5)Art lectures ");
       System.out.println("6)All lectures");
       System.out.println("==============");
       int tempselect=sc.nextInt();

       switch (tempselect){
           case 1:{
               for(int i=0;i<engineeringLectures.size();i++)
                   engineeringLectures.get(i).LectureInfo(); }
           case 2:{
               for(int i=0;i<medicineLectures.size();i++)
           medicineLectures.get(i).LectureInfo();}
           case 3:{
               for(int i=0;i<lawLectures.size();i++)
                   lawLectures.get(i).LectureInfo();}
           case 4:{
               for(int i=0;i<businessLectures.size();i++)
                   businessLectures.get(i).LectureInfo();
           }
           case 5:{
               for(int i=0;i<artLectures.size();i++)
                   artLectures.get(i).LectureInfo();
           }
           case 6:{
               for(int i=0;i<allLectures.size();i++){
                   allLectures.get(i).LectureInfo();
               }
           }
       }



   }




    public void InstructorRegistration() {
        while (true) {
            String tempName,tempLecture,tempFaculty;
            tempLecture=null;
            long tempId=0;
            int tempStartYear=0;
            System.out.println("INSTRUCTOR REGISTRATION");
            System.out.println("=============");
            System.out.println("Full Name:");
            tempName=sc.nextLine();
            System.out.println("Faculty: ");
            tempFaculty=sc.nextLine();
            System.out.println("Lecture:");
            String x=sc.next();
            for(int i=0;i<allLectures.size();i++){
            if(x.equals(allLectures.get(i).getLectureID())){
                tempLecture=allLectures.get(i).getLectureID();
            }}
            for(int i=0;i<engineeringLectures.size();i++){
                if(x.equals(engineeringLectures.get(i).getLectureID())){
                    tempLecture=engineeringLectures.get(i).getLectureID();
                }}
            for(int i=0;i<medicineLectures.size();i++){
                if(x.equals(medicineLectures.get(i).getLectureID())){
                    tempLecture=medicineLectures.get(i).getLectureID();
                }}
            for(int i=0;i<artLectures.size();i++){
                if(x.equals(artLectures.get(i).getLectureID())){
                    tempLecture=artLectures.get(i).getLectureID();
                }}
            for(int i=0;i<businessLectures.size();i++){
                if(x.equals(businessLectures.get(i).getLectureID())){
                    tempLecture=businessLectures.get(i).getLectureID();
                }}
            for(int i=0;i<lawLectures.size();i++){
                if(x.equals(businessLectures.get(i).getLectureID())){
                    tempLecture=businessLectures.get(i).getLectureID();
                }}

            System.out.println("Starting Year:");
            tempStartYear= sc.nextInt();

            Users tempInstructor= new Instructor(tempName,tempId,tempLecture,tempFaculty,tempStartYear);
            instructors.add((Instructor) tempInstructor);
            DetermineInstructorID();
            System.out.println("Please Confirm ID:");
            tempId=sc.nextLong();
            instructors.get(instructors.size()-1).setID(tempId);
            System.out.println("Instructor is registered successfully!");

            System.out.println("Do you want add more instructors Yes/No?");
            sc.nextLine();

            String response2=sc.nextLine();
            if(response2.equals("N")
                    || response2.equals("n")
                    || response2.equals("No")
                    || response2.equals("no"))
            {
                break ;
            }
            else if(response2.equals("Y")
                    || response2.equals("y")
                    || response2.equals("Yes")
                    || response2.equals("yes"))
            {
                System.out.println("Continue...");
            }

            }


        }

    public void DetermineInstructorID()
    {

        label: while(true)
        {
            Random rand=new Random();
            switch(instructors.get(instructors.size()-1).getFaculty())
            {
                case "Engineering":
                    System.out.println("ID: " + instructors.get(instructors.size()-1).getYearofStarting()
                            + "032"+rand.nextInt((999 - 100) + 1) + 100);
                    break label;

                case "Medicine":
                    System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                            + "054"+ rand.nextInt((999 - 100) + 1) + 100);
                    break label;
                case  "Law" :
                    System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                            + "174"+rand.nextInt((999 - 100) + 1) + 100);
                    break label;
                case "Business":
                    System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                            + "265"+ rand.nextInt((999 - 100) + 1) + 100);
                    break label ;
                case "Art":
                    System.out.println("ID: " + students.get(students.size()-1).getYearOfStarting()
                            + "347"+ rand.nextInt((999 - 100) + 1) + 100);
                    break  label;
                default:
                    System.out.println("Oops!Something went wrong.ID could not be determined(Check the Faculty)");
                    System.out.print("Faculty: ");
                    instructors.get(instructors.size()-1).setFaculty(sc.nextLine());
                    break;
            }
        }
    }



}
