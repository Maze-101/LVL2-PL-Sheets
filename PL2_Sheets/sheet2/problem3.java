package sheet2;
import java.util.*;

public class problem3 {
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int n = s.nextInt();

        System.out.println("Enter students name and grades : ");

        String name , max_name = "", second_max_name = ""; Double grade , max_grade = -1.0 , second_max_grade = -1.0;

        for(int i = 0; i < n ; i++){
            
            name = s.next(); grade = s.nextDouble();
            s.nextLine();

            if(grade >= max_grade){
                max_grade = grade;
                max_name = name;
            }
            else if(grade >= second_max_grade && grade <= max_grade){
                second_max_grade = grade;
                second_max_name = name;
            }
        }

        System.out.printf("The highest grade is %.2f for the student %s\n", max_grade , max_name);
        System.out.printf("The second highest grade is %.2f for the student %s\n", second_max_grade , second_max_name);

        s.close();
    }
}