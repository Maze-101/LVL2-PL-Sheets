package sheet1;
import java.util.Random ;

public class problem7 {
    public static void main(String[] args) {
        Random r = new Random();

        int random = r.nextInt(1,13);

        System.out.println("The generated number is : " + random);
        
        switch (random) {
            case 1:
                System.out.println("This month is January");
                break;
            case 2:
                System.out.println("This month is February");
                break;
            case 3:
                System.out.println("This month is March");
                break;
            case 4:
                System.out.println("This month is April");
                break;
            case 5:
                System.out.println("This month is May");
                break;
            case 6:
                System.out.println("This month is June");
                break;
            case 7:
                System.out.println("This month is July");
                break;
            case 8:
                System.out.println("This month is August");
                break;
            case 9:
                System.out.println("This month is September");
                break;
            case 10:
                System.out.println("This month is October");
                break;
            case 11:
                System.out.println("This month is November");
                break;
            case 12:
                System.out.println("This month is December");
                break;
        }
    }
}
