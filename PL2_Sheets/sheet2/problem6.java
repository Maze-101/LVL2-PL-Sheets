package PL2_Sheets.sheet2;
import java.util.*;
public class problem6 {

    public static void displaySortedNumbers(int num1 , int num2 , int num3){
        if(num1 >= num2 && num1 >= num3){
            if(num2 >= num3) System.out.printf("%d %d %d",num3,num2,num1);
            else System.out.printf("%d %d %d",num2,num3,num1);
        }
        else if(num2 >= num1 && num2 >= num3){
            if(num1 >= num3) System.out.printf("%d %d %d",num3,num1,num2);
            else System.out.printf("%d %d %d",num1,num3,num2);
        }
        else {
            if(num2 >= num1) System.out.printf("%d %d %d",num1,num2,num3);
            else System.out.printf("%d %d %d",num2,num1,num3);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 3 numbers : ");
        int n1 = s.nextInt() , n2 = s.nextInt() , n3 = s.nextInt();

        displaySortedNumbers(n1,n2,n3);

        System.out.println();

        s.close();
    }
}
