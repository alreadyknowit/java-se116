package Donem1;

/*
 * Created by Ilker Korkmaz
 *
 * Question: Print the years starting from the current year to your birth year in a descending order.
 */
public class NewClass {
    public static void main(String[] args) {
        int currentYear = 2018;
        int myBirthYear = 1999;
        int count = 0;  // to be used to count the maximum number of years printed in a line on screen

        for (int i = currentYear; i >= myBirthYear; i--) {
            System.out.print ( i + " " );

            count++;
            /* The next condition is just an accessory to print newlines */
            if (count == 5) { // the following is also OK: if(count%5==0)
                System.out.print('\n');
                count=0;
            }
        }
    }
}
