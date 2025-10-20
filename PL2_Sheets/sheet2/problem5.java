package sheet2;
import java.util.*;

public class problem5 {

    static int reversedN = 0;

    public static int reverse(int number){
        int reversedNumber = 0;

        while(number != 0) {
            int digit = number % 10;
            
            reversedNumber = reversedNumber * 10 + digit;
            
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number){
        if(number == reversedN) return true;
        else return false;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = s.nextInt();

        reversedN = reverse(n);

        if(isPalindrome(n)) System.out.println("The is a palindromic integer :)");
        else System.out.println("This is not a palindromic integer :(");

        s.close();
    }
}
