package PL2_Sheets.sheet2;

public class problem11 {
    public static void sort(int[] correct){ // Bubble sort algorithm
        for (int i = 0; i < correct.length; i++) {
            boolean sorted = true;
            for (int j = 1; j < correct.length; j++) {
                if(correct[j] < correct[j-1]){ // swapping technique
                    int tmp = correct[j-1];
                    correct[j-1] = correct[j];
                    correct[j] = tmp;
                    sorted = false;
                }
            }
            if(sorted) break; 
        }
    }
    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] correct = new int[8]; 

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < keys.length; j++) {
                if(answers[i][j] == keys[j]) correct[i]++;
            }
        }

        sort(correct);

        for (int i = 0; i < correct.length; i++) {
            System.out.printf("Student %d has %d correct answers\n", i+1, correct[i]);
        }
    }    
}
