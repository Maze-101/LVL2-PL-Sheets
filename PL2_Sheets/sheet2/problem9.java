package PL2_Sheets.sheet2;
import java.util.*;
public class problem9 {

    public static double min(double[] array) {
        double min = 1000000;

        for (int i = 0; i < array.length; i++) {
            if(array[i] <= min) min = array[i];
        }

        return min;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter 10 numbers : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextDouble();
        }

        System.out.println("The minimum number is : " + min(array) );
    }
}
