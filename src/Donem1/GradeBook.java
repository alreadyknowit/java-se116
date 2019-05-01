package Donem1;


public class GradeBook {
    
  private String courseName;
  private int[] grades;
    

public void setCourseName(String courseName)
{
 this.courseName=courseName;
}
public String getCourseName()
{
    return courseName;
}
public GradeBook(String courseName, int[] grades)
{
    this.courseName=courseName;
    this.grades=grades;
}
    public void processGrades()
    {
         outputGrades();
         
        System.out.printf("%nClass avarage is %.2f%n",getAverage());
        
      System.out.printf("The minimum grade is %d%nThe maximum grade is %d%n", getMinimum(), getMaximum());
      
       outBarChart();
        
    }
    public int getMinimum()
    {
        int minGrade=grades[0];
        
        for(int grade : grades)
        {
            if(grade< minGrade)
                minGrade= grade;
        }
        return minGrade;
    }
     public int getMaximum()
    {
        int maxGrade=grades[0];
        
        for(int grade : grades)
        {
            if(grade> maxGrade)
                maxGrade= grade;
        }
        return maxGrade;
    }
     public double getAverage()
     {
        
         int total=0;
         for(int grade : grades)
         {
             total +=grade;
         }
        double average= total/grades.length;
       
        return average;
     }
     
     public void outBarChart()
     {
         int frequency[]= new int[11];
         
         for(int grade :grades)
     ++frequency[grade/10];
         for(int counter =0;counter<frequency.length;counter++)
         {
             if(counter==10)
                 System.out.printf("%5d:",100);
             else
                 System.out.printf("%02d-%02d", counter*10, counter*10 +9);
             
             for(int stars =0; stars<frequency[counter];stars++)
                 System.out.print("*");
             System.out.println();
             
             
         }
     }
     
     public void outputGrades()
     {
         System.out.printf("The grades are:%n%n");
         
         for(int student =0; student<grades.length;student++)
         {
             System.out.printf("%s%2d%s%3d%n","Student",student+1,":", grades[student]);
         }
     }
     public static void main(String[] args) 
     {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        GradeBook obj = new GradeBook("SE115 Introduction to Programing", gradesArray);
         System.out.printf("Welcome to the grade book for%n%s%n%n",obj.courseName);
         obj.processGrades();
    }
    
}