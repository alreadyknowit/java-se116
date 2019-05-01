package Donem1;


public class PassArray {
    
    public static void main(String args[]){
        
        int array []= {1,2,3,4,5};
        
        System.out.printf("The value of the original array are: %n");
        
        for(int value: array)
            System.out.printf("  %d",value);
         //   System.out.println();
         
         modifyArray(array);
         System.out.printf("%n%nThe values of the modified array are:%n");
         for(int value: array)
          System.out.printf(" %2d",value);
         modifyElement(array[3]);
         System.out.printf("New elements' values:%2d%n", array[3]);
         
    }
         public static void modifyArray( int array2[])
         {
           
             for(int counter=0; counter<array2.length; counter++)
             {
                 array2[counter]*=2;
             }
         }
             public static void modifyElement( int element )
             {
              element*=2;   
                 System.out.printf("%nThe value of element in modifyArray is :%2d%n",element);
             }
         

    
}
