package sheet1;
import java.util.*;

public class problem12 {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        System.out.print("Enter number of sides : ");
        int n = i.nextInt();

        System.out.print("Enter the side length : ");
        Double s = i.nextDouble();

        Double area = (n * Math.pow(s,2)) / (4 * Math.tan(Math.toRadians(Math.PI / n)));

        System.out.println("The area of the polygon is " + area);

        i.close();
        
    }
}
