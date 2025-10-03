package PL2_Sheets.sheet2;

public class problem1 {
    public static void main(String[] args){
        
        final Double RATIO = 1.609;
        
        System.out.println("Miles    Kilometers");

        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + "        " + i * RATIO);
        }
    }
}

