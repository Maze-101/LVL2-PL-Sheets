package PL2_Sheets.sheet1;

public class problem11 { 
    public static void main(String[] args) {  

        final double earthRadius = 6371.01;  

        final double x_Charlotte = Math.toRadians(35.2270869);
        final double y_Charlotte = Math.toRadians(-80.8431267); 
        final double x_Atlanta = Math.toRadians(33.7489954); 
        final double y_Atlanta = Math.toRadians(-84.3879824); 
        final double x_Orlando = Math.toRadians(28.5383355); 
        final double y_Orlando = Math.toRadians(-81.3792365); 
        final double x_Savannah = Math.toRadians(32.0835407); 
        final double y_Savannah = Math.toRadians(-81.0998342); 
        
        double d_Charlotte_Atlanta = earthRadius * Math.acos(Math.sin(x_Charlotte) * Math.sin(x_Atlanta)  
                                    + Math.cos(x_Charlotte) * Math.cos(x_Atlanta) * Math.cos(y_Charlotte-y_Atlanta)); 
        
        double d_Orlando_Atlanta = earthRadius * Math.acos(Math.sin(x_Orlando) * Math.sin(x_Atlanta)  
                                    + Math.cos(x_Orlando) * Math.cos(x_Atlanta) * Math.cos(y_Orlando-y_Atlanta));  
        
        double d_Orlando_Savannah = earthRadius * Math.acos(Math.sin(x_Orlando) * Math.sin(x_Savannah)  
                                    + Math.cos(x_Orlando) * Math.cos(x_Savannah) * Math.cos(y_Orlando-y_Savannah));  
        
        double d_Charlotte_Savannah = earthRadius * Math.acos(Math.sin(x_Charlotte) * Math.sin(x_Savannah)  
                                    + Math.cos(x_Charlotte) * Math.cos(x_Savannah) * Math.cos(y_Charlotte-y_Savannah));  
        
        double d_Charlotte_Orlando = earthRadius * Math.acos(Math.sin(x_Charlotte) * Math.sin(x_Orlando)  
                                    + Math.cos(x_Charlotte) * Math.cos(x_Orlando) * Math.cos(y_Charlotte-y_Orlando));  
    
        double s1 = (d_Charlotte_Atlanta + d_Orlando_Atlanta + d_Charlotte_Orlando) / 2; 
        
        double area1 = Math.sqrt(s1 * (s1 - d_Charlotte_Atlanta) * (s1 - d_Orlando_Atlanta) * (s1 - d_Charlotte_Orlando)); 
        
        double s2 = (d_Charlotte_Savannah + d_Orlando_Savannah + d_Charlotte_Orlando) / 2; 
        
        double area2 = Math.sqrt(s2 * (s2 - d_Charlotte_Savannah) * (s2 - d_Orlando_Savannah) * (s2 - d_Charlotte_Orlando)); 
        
        double finalArea = area1 + area2; 
        System.out.println("The area is: " + finalArea); 
    }
}