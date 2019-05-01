package Donem1;

import java.security.SecureRandom;

public class StudentPoll {
    public static void main(String[] args) {
        
    
 
      SecureRandom randomVote = new SecureRandom();
    int student[]= new int[6];
    
    for(int counter=1; counter<=20;counter++)
    ++student[ 1+ randomVote.nextInt(5)];
    System.out.printf("%s%15s%n", "Rating","Frequency");
      
          for(int vote=1; vote<student.length; vote++)
            System.out.printf("%3d%11d%n", vote,student[vote] );
    
}
}