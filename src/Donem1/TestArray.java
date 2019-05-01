package Donem1;

//mport java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        
         int[]arrayList= new int [10];    
          
          
          System.out.printf("%s%8s%n" , "Index", "Value");
          
          for(int counter=0;counter<arrayList.length;counter++)
          {
              System.out.printf("%2d%8d%n" ,counter, arrayList[counter]);
              System.out.println();
          }
          int[] array = new int[12];
          
          for( int counter2=0; counter2<array.length;counter2++)
          {
              array[counter2]=2+counter2*2;
              System.out.printf("%s%8s%n", "Index","List");
              System.out.printf("%2d%8d%n",counter2,array[counter2]);          
          }
                 
          int[] sumArray={12,25,-26,92,56,48,83,-59,-23};
          int total=0;    
          for(int counter3=0;counter3<sumArray.length;counter3++) 
          total += sumArray[counter3];
          
                System.out.printf("%s%8s%n" ,"Total:",total);
    }
}
