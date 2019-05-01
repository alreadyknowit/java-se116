package Donem1;


public  class Foo{
    
    public static int [] PascalRow( int row)
    {
        if( row == 0)
        {
            int [] rowZero = {1};
        return rowZero;
    }
        if (row == 1)
        {
         int [ ] rowOne = {1,1};
         return rowOne;
        }
        
        int  [] previous = {1,1};
        for(int i =2 ; i<=row; i++ )
        {
            int next [] = new int[i+1];
            next [0]=1;
           
            for(int x =1; x<row; x++)
            {
               next [x] = next[x-1] + next[x];
                
            }
             next[i]=1;
            previous = next;
           
        }
         return previous; 
        
    }  
    
    public static void main(String[] args) {
      
        int result  []= PascalRow(4);
        for ( int r : result)
            System.out.print(r + " ");
    }
}
