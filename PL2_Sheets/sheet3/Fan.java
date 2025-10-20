package sheet3;

public class Fan {

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
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
}
