package PL2_Sheets.sheet1;
import java.util.Scanner;

public class problem10 {

    public static void main(String[] args) {
        
        final Double RADIUS = 6371.01;

        Scanner i = new Scanner(System.in);
        
        System.out.print("Enter point 1 ( latitude and longitude ) in dgrees : ");
        Double x1 = i.nextDouble(), y1 = i.nextDouble();
        
        System.out.println();

        System.out.print("Enter point 2 ( latitude and longitude ) in dgrees : ");
        Double x2 = i.nextDouble(), y2 = i.nextDouble();

        System.out.println();

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double bruh = (Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1)); 

        Double d = RADIUS * Math.acos(bruh);
        
        System.out.printf("The distance between the two points is %.11f km\n", d);

        i.close();
    }
}
