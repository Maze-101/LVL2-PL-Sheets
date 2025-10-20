package sheet1;
import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        
        String isbn9String = s.nextLine();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            char digitChar = isbn9String.charAt(i); 
            
            int d = Character.getNumericValue(digitChar); 
            
            sum += d * (i + 1);
        }

        int checksum = sum % 11;

        System.out.print("The ISBN-10 number is ");
        
        System.out.print(isbn9String); 

        if (checksum == 10) {
            System.out.println("X");
        } else {
            System.out.println(checksum);
        }
        
        s.close();
    }
}
