package PL2_Sheets.sheet2;
import java.util.*;

public class problem4 {

    public static int sumDigits(long n){
        
        int sum = 0;

        while(n != 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n : ");
        long n = s.nextLong();

        System.out.printf("The sum of digits of the number %d is %d\n", n , sumDigits(n));
        
        s.close();
    }
}
