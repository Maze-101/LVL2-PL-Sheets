package sheet1;
import java.util.Scanner;

public class problem8 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter today's day : ");
        int today = s.nextInt();

        String day;

        if(today == 0) day = "Sunday";
        else if(today == 1) day = "Monday";
        else if(today == 2) day = "Tuesday";
        else if(today == 3) day = "Wednesday";
        else if(today == 4) day = "Thursday";
        else if(today == 5) day = "Friday";
        else day = "Saturday";

        System.out.print("Enter the number of days elapsed since today : ");
        int added = s.nextInt();

        int mod = (today + added) % 7;

        String future;

        if(mod == 0) future = "Sunday";
        else if(mod == 1) future = "Monday";
        else if(mod == 2) future = "Tuesday";
        else if(mod == 3) future = "Wednesday";
        else if(mod == 4) future = "Thursday";
        else if(mod == 5) future = "Friday";
        else future = "Saturday";

        System.out.println("Today is " + day + " and the future day is " + future + "\n");

        s.close();
    }
}
