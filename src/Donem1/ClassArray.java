package Donem1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ClassArray {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("How many integer you want to add?");
        int num = a.nextInt();
      
        int array[] = new int[num];

        System.out.println("Enter array elements");
        for (int value = 0; value < array.length; value++) {
            array[value] = a.nextInt();
        }

        //PRINTINGARRAYLIST 
        printArray(array); //printing array that be read from the user.

        //SORTINGARRAYLIST
        sortArray(array);

        System.out.println("The sorted value of array is: ");
        for (int value = 0; value < num; value++) {
            System.out.printf(array[value] + "\t");
        }

        //BINARYSEARCH
        System.out.println();
        System.out.println("Enter a value to be searched in the array");
        int key = a.nextInt();
        
       ClassArray object = new ClassArray();
       
        System.out.printf("%nThe index of array is : ");
       //  binarySearch(array, key);
         object.binarySearch(array, key);

    }

    public static void printArray(int array2[]) 
    {

        System.out.println("Here is your array list: ");
        int n = array2.length;
        for (int i = 0; i < n; i++) {
         System.out.print(array2[i] + "\t");
        }
        System.out.println();
    }

    public static void sortArray(int sortArray[]) {
        Arrays.sort(sortArray);
    }

    public static int binarySearch(int binaryArray[], int key) {
        
        int result = Arrays.binarySearch(binaryArray, key);
        return result;
    }

}
