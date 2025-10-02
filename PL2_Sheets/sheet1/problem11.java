package PL2_Sheets.sheet1;

public class problem11 {
    public static void main(String[] args) {
        
        final Double X_CHARLOTTE = 35.2270869;
        final Double Y_CHARLOTTE = -80.8431267;
        final Double X_SAVANNAH = 32.0835407;
        final Double Y_SAVANNAH = -81.0998342;
        final Double X_ORLANDO = 28.5383355;
        final Double Y_ORLANDO = -81.3792365;
        final Double X_ATLANTA = 33.7489954;
        final Double Y_ATLANTA = -84.3879824;

        Double d1 = Math.sqrt(Math.pow((X_CHARLOTTE - X_SAVANNAH),2) + Math.pow((Y_CHARLOTTE - Y_SAVANNAH),2));
        Double d2 = Math.sqrt(Math.pow((X_ORLANDO - X_SAVANNAH),2) + Math.pow((Y_ORLANDO - Y_SAVANNAH),2));
        Double d3 = Math.sqrt(Math.pow((X_ORLANDO - X_ATLANTA),2) + Math.pow((Y_ORLANDO - Y_ATLANTA),2));
        Double d4 = Math.sqrt(Math.pow((X_CHARLOTTE - X_ATLANTA),2) + Math.pow((Y_CHARLOTTE - Y_ATLANTA),2));

        Double base = Math.sqrt(Math.pow((X_SAVANNAH - X_ATLANTA),2) + Math.pow((Y_SAVANNAH - Y_ATLANTA),2));

        Double s1 = (d1 + d4 + base) / 2;
        Double s2 = (d2 + d3 + base) / 2;

        Double triangle1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d4) * (s1 - base));
        Double triangle2 = Math.sqrt(s2 * (s2 - d2) * (s2 - d3) * (s2 - base));
    
        Double total_area = triangle1 + triangle2;
        System.out.println("Total area of the triangle is " + total_area);
    
    }
}
