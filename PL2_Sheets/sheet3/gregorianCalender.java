package sheet3;
import java.util.GregorianCalendar;

public class gregorianCalender {
    public static void main(String[] args) {
        
        System.out.println("--- Current Time ---");
        
        GregorianCalendar calendar1 = new GregorianCalendar();
        
        int currentYear = calendar1.get(GregorianCalendar.YEAR);
        int currentMonth = calendar1.get(GregorianCalendar.MONTH) + 1; 
        int currentDay = calendar1.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + currentMonth);
        System.out.println("Day: " + currentDay);
        System.out.println();

        System.out.println("--- Specified Elapsed Time ---");
        
        calendar1.setTimeInMillis(1234567898765L);
        
        int specifiedYear = calendar1.get(GregorianCalendar.YEAR);
        int specifiedMonth = calendar1.get(GregorianCalendar.MONTH) + 1;
        int specifiedDay = calendar1.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Time elapsed: 1234567898765L ms");
        System.out.println("Year: " + specifiedYear);
        System.out.println("Month: " + specifiedMonth);
        System.out.println("Day: " + specifiedDay);
    }
}