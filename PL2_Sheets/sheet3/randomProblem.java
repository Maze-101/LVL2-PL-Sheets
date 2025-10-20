package sheet3;
import java.util.Random;

public class randomProblem {
    public static void main(String[] args) {
        Random r = new Random(1000);

        for (int i = 1; i <= 50; i++) {
            System.out.printf("Random %d : %d\n", i, r.nextInt(100));
        }
    }
}
