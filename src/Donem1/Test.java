package Donem1;

public class Test {
  public static void main(String[] args) {
  
  }
  
  public void iterativeMethod(int[] array, int begin) {
    if(begin < 0 || begin >= array.length){
        return;
    }
     for (int i = begin; i < array.length; i++) {
        System.out.print(array[i] + " ");
   
     }
}
 
  
}