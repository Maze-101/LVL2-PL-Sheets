package PL2_Sheets.sheet1;

public class problem3 {
    public static void main(String[] args) {
        // These are now doubles for accurate calculations
        double birth = 7.0;
        double death = 13.0;
        double immigrant = 45.0;
        double seconds_in_year = 365.0 * 24 * 60 * 60;

        long current_population = 312032486;

        double added_population = (seconds_in_year / birth) + (seconds_in_year / immigrant) - (seconds_in_year / death);

        System.out.println("Initial population is " + current_population);

        System.out.println("--------------------------------------");

        System.out.println("Population after one year is " + (long)(current_population + added_population));
        System.out.println("Population after two years is " + (long)(current_population + 2 * added_population));
        System.out.println("Population after three years is " + (long)(current_population + 3 * added_population));
        System.out.println("Population after four years is " + (long)(current_population + 4 * added_population));
        System.out.println("Population after five years is " + (long)(current_population + 5 * added_population));
    }
}