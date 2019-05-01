
package Donem2.Lab4;

import java.util.ArrayList;



public class Test {
    
    public static void main(String[] args) {
        ArrayList<Student> mySt = new ArrayList<Student>();
        Lecturer Lecturer1 = new Lecturer(26032,"X");
        Lecturer1.AddStudent(mySt);
        Lecturer1.PrintStudent(mySt);
        
        Lecturer Lecturer2 = new Lecturer(201906,"Y");
        
        
    }
}
