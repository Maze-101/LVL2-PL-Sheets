package sheet2;
import java.util.*;
public class problem10 {

    public static double sumMajorDiagonal(double[][] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == j) sum += a[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of matrix : ");
        int n = s.nextInt();

        System.out.println("Enter matrix : ");

        double[][] a = new double[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = s.nextDouble();
            }
        }

        System.out.printf("Sum of elements in the major diagonal is : %.3f\n" , sumMajorDiagonal(a));

        s.close();
    }
}
