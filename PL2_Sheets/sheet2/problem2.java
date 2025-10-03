package PL2_Sheets.sheet2;

public class problem2 {
    public static void main(String[] args){

        Double current_tuition = 10000.0;

        for(int i = 1; i<=10; i++){

            current_tuition *= (1 + 5.0/100);

            System.out.printf("Tuition of year %d is %.2f\n", i , current_tuition);
        
        }

        Double four_years_tuition = 0.0;

        for(int i = 1 ; i <= 4 ; i++){
            
            four_years_tuition += current_tuition;

            current_tuition *= (1 + 5.0/100);

        }

        System.out.printf("Total of four years after the tenth year is %.2f\n", four_years_tuition);
    }
}