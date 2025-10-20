package sheet2;
public class problem8 {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 0; i < 100; i++) {
            
            int randomNumber = (int)(Math.random() * 10);

            counts[randomNumber]++;

        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("The number %d is randomly generated %d time/s\n",i,counts[i]);
        }
    }
}
