package sheet3;

public class Fan {

    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public Fan(int speed, boolean status, double radius, String color){
        this.speed = speed;
        this.on = status;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed){
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        }
    }

    public void setStatus(boolean status){
        this.on = status;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public void setColor(String color){
        this.color= color;
    }

    public int getSpeed(){
        return speed;
    }

    public boolean getStatus(){
        return on;
    }

    public double getradius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return String.format("Fan [Status: %s, Speed: %d, Radius: %.1f, Color: %s]",
                (on ? "on" : "off"), speed, radius, color);
    }

    public static void main(String[] args) {
        
        Fan f1 = new Fan(SLOW,true,10.0,"Yellow");
        Fan f2 = new Fan(FAST,false,5.0,"Blue");

        System.out.println("Fan 1 : " + f1.toString() + "\n" +
                           "Fan 2 : " + f2.toString() + "\n");
    }
}
