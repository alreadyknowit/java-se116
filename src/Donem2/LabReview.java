
package Donem2;

 import java.util.Scanner;
public class LabReview {
 
public static void main(String[] args) 
 {
       Scanner input = new Scanner(System.in);
       
       //Lab 1-2:
      /*  
        DailyTemperature();
    /*
       //Lab 3 :
      
    
          System.out.print("Enter a nonnegative integer:");
          int fact=input.nextInt();
          System.out.println(Factorial(fact)); 
  
        //Lab 4 and 9:
        
        System.out.print("Enter a begin value:");
        int beginValue=input.nextInt();
        System.out.print("Enter an end value:");
        int endValue=input.nextInt();
        Factorial2(beginValue,endValue);
        
       //Lab 5:
        LabReview obj = new LabReview();
        obj.TemperatureArray();
      
        //Lab 6 and 7:
        
        System.out.println("Enter base,then exponent");
        int base=input.nextInt();
        int exp=input.nextInt();
        expNumbersRecursive(base, exp);
        LabReview object = new LabReview();
        System.out.println(object.expNumberesIterative(base, exp));
        
      
        //Lab 8:
         Array();
            */
      
        //Lab 10:
      //  TwoDimensionalArray(3, 2);
      
        
    }
  
public static void DailyTemperature()
{
   
    Scanner input=new Scanner(System.in);
    int degree=0; 
    
    int hotDayCounter=0;
    int pleasantDayCounter=0;
    int coldDayCounter=0;
    int total=0;
    int lowest;
    int highest;
    double averageT=0;
   
    lowest=degree;
    highest=degree;
    while(degree != -1000)
    {
    if(degree<=lowest)
    {
    lowest=degree;
    }
    
    if(degree>=highest)
    {
     highest=degree;
    }
    
    if(degree>=30)
    {
    System.out.println( degree + " is a hot day."); 
    hotDayCounter++;
   
    }
    else if(degree<30 && degree>16)
    {
    System.out.println(degree + " is a pleasant day.");
    pleasantDayCounter++;
    }
    
    else
    {
    System.out.println(degree + " is a cold day.");
    coldDayCounter++;
    }
    total+=degree;
    averageT=total/(hotDayCounter+coldDayCounter+pleasantDayCounter);
    
    System.out.println("Enter a degree");
        degree = input.nextInt();
    }
 
    System.out.println("Number of cold days: " + coldDayCounter);
    System.out.println("Number of pleasant days: " +pleasantDayCounter);
    System.out.println("Number of hot days: " +hotDayCounter);
    System.out.println("The lowest temperature is " +lowest+" degrees Celsius.");
    System.out.println("The highest temperature is " +highest+" degrees Celsius.");
    System.out.println("The average temperature is " + averageT + " degrees Celsius.");
}

public static int Factorial(int fact)
{
    if(fact==0)
    {
     return 1;
    }
    
    int result=1;
    for(int i=fact; i>=1; i--)
    {
    result*=i;
    }
    return result;
  
}

public static void Factorial2(int beginValue, int endValue)
{
    for(int i=beginValue; i<=endValue;i++)
    {
        int result=1;
        for(int j=i; j>=i;j--)
        {  
        result*=i;
        }
     System.out.println(i + "!= "+ result);
     
    }
}

public void TemperatureArray()
{
    Scanner a = new Scanner(System.in);
    
    final int SIZE =5;
    int hotDays=0;
    int[] tempArray = new int[SIZE];
 
    System.out.println("Enter " + SIZE +" integer temperature values.");
    for(int i=0; i<tempArray.length;i++)
    { 
    tempArray[i]=a.nextInt();
    }
    int highesTemp=tempArray[0];
 
    for(int value : tempArray)
    {
    if(value>highesTemp)
    highesTemp=value;
    if(value > 33)
    hotDays++;
    }
 
    System.out.println("The total number of hot days: " + hotDays);
    System.out.println("The highest temperature value: "+highesTemp);
}

    public static void expNumbersRecursive(int base, int exp)
    { 
        System.out.println(Math.pow(base, exp));
    }
    
public int expNumberesIterative(int base, int exp)
    {
      int result=1;
      for(int i=exp; exp>=1;exp--)
     {
      result*=base;
     }
     return result;
    }

public static void Array()
    {
        Scanner input = new Scanner(System.in);
      
        final int SIZE=8;
        int[] Array = new int[SIZE];
        int min=0; 
        
        System.out.println("Fill the array with " +SIZE+ " integers.");
        for(int i=0; i<Array.length;i++)
        {
         Array[i]=input.nextInt();
        }
        
        System.out.println("Array contains the following");
        for(int content : Array)
        {
            System.out.print(content +" ");
        }
      
        min=Array[0];
        for(int i=0; i<Array.length;i++)
        {
         if(Array[i]<=min)
         min=Array[i];
        }
        System.out.println();
        System.out.println("The minimum value: " + min);
        
        System.out.print("Enter a value to search: " );
        int key= input.nextInt();
        
        boolean flag =false;
        for(int i=0; i<SIZE;i++)
        {     
        if(Array[i]==key)
        {
        flag=true;
        break;
        }
        }
        if(flag)
        System.out.println("Found");
        else
        System.out.println("Not Found");
        
    }


public static void TwoDimensionalArray(int row, int column)
{
     Scanner input = new Scanner(System.in);
    
     
     int Matrix1 [][]= new int [row][column];
     
     for(int i=0; i<row; i++)
     {
        for(int j=0;j<column; j++)
        {
            System.out.println("Enter the value for [row#"+i+ " , column#"+j+ "] : ");
            Matrix1[i][j]=input.nextInt();
       }
     }
     
    int Matrix2 [][]= new int [row][column];
    
    for(int i=0; i<row; i++)
    {
      for(int j=0; j<column; j++)
      {
      System.out.println("Enter the value for [row#"+i+" , column#" +j+"]: ");
      Matrix2[i][j]=input.nextInt();
      }
    }
    
    int result [][]= new int [row][column];
     for(int i=0; i<row; i++)
    {
      for(int j=0; j<column; j++)
      {
      result[i][j]=Matrix1[i][j]+Matrix2[i][j];
              
      }
    }
     
     System.out.println("The sum of the two matrixes is:");
    for(int i=0; i<result.length; i++)
    {
      for(int j=0; j<result[i].length; j++)
      {
      result[i][j]=Matrix1[i][j]+Matrix2[i][j];
      System.out.print(result[i][j] + " ");
      }
    }
    
    int max = result[0][0];
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<result[i].length; j++)
        {
            if(result[i][j]>max)
            max=result[i][j];
        }
    
    }
    System.out.println("The maximum value is: " + max);
    
}
}
