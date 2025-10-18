package PL2_Sheets.sheet2;
import java.util.*;
public class problem7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10];

        System.out.print("Enter 10 numbers : ");

        for(int i = 0 ; i < a.length ; i++){
            a[i] = s.nextInt();
        }

        System.out.print("The reversed version of the numbers you entered : ");
    
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[(a.length)-i-1] + " ");
        }

        System.out.println();

        s.close();
    }
}
