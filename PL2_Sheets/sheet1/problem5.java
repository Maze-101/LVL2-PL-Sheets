package PL2_Sheets.sheet1;
import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate : ");

        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();

        gratuity = (gratuity / 100) * subtotal;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $"+gratuity+" and total is $"+total+"\n");
    
        input.close();
    }
}
