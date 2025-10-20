package sheet1;
import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000 : ");

        int n = s.nextInt();

        int mod = n % 10;
        int sum = mod;
        n /= 10;

        mod = n % 10;
        sum += mod;
        n /= 10;

        mod = n % 10;
        sum += mod;
        n /= 10;

        System.out.println("The sum of the digits is " + sum);
        
        s.close();
    }
}