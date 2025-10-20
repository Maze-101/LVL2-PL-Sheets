package sheet1;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        final Double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius and Length : ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);

        input.close();
    }
}
