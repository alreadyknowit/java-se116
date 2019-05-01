package Donem1;


public class aaaaaa {
    public static void main(String[] args) {
         int a[][]= {{1,2},{2,3},{2,9},{3,9,4},};
       int total =0;
         for(int x[]: a)
         for (int y :x)
         {
           
             total+=y;
         }
         System.out.println(a.length);
         System.out.println(total);
           int size =a.length*a[0].length;
           System.out.println(size);
           double av= total/size;
           System.out.println(av);
    }
   
    
    
}
