package sheet3;
import java.util.Date;

public class ElapsedTime{
    public static void main(String[] args) {

        long[] elapsedTimes = {
            10000L,
            100000L,
            1000000L,
            10000000L,
            100000000L,
            1000000000L,
            10000000000L,
            100000000000L
        };

        Date date = new Date();

        for (long time : elapsedTimes) {

            date.setTime(time);

            System.out.println("Elapsed time " + time + "ms: " + date.toString());

        }
    }
}