package sheet3;

import java.util.Random;

public class stopwatch {
    
    private long startTime;
    private long endTime;
    
    public stopwatch() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 100000;

        double[] numbers = new double[ARRAY_SIZE];
        Random rand = new Random();

        System.out.println("Creating an array of " + ARRAY_SIZE + " random numbers...");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextDouble();
        }

        stopwatch timer = new stopwatch();

        System.out.println("Starting selection sort...");
        timer.start();

        selectionSort(numbers);

        timer.stop();
        System.out.println("Sorting completed.");

        System.out.println("The selection sort for " + ARRAY_SIZE + " numbers took: "
                           + timer.getElapsedTime() + " milliseconds.");
    }
    
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}