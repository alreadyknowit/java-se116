package Donem1;


public class EnhancedForTest {
  public static void main(String[] args) {
      
      int array[]= {2,3,5,6,7,8,9};
        int total=1;
       for(int number : array)
      total*=number;
       System.out.printf("%s%d%n","Total=",total);

    }
  
}
