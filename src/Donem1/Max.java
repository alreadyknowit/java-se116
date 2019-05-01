package Donem1;


public class Max {
    public static void main(String[] args) {
    int [] arrayList ={4500,5,6,19,-20,15,90,-15,-29,296,3050};
    int maxValue=0;
    for(int i =0;i<arrayList.length;i++)
    {
        maxValue=arrayList[0];
        if(arrayList[i]>=maxValue)
            maxValue=arrayList[i];
          
    }
        System.out.println(maxValue);
}
}