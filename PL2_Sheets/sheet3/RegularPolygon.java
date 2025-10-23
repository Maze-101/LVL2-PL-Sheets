package sheet3;

public class RegularPolygon {
    private int n;
    private double side, x, y;

    public RegularPolygon() {
        n = 3;
        side = 1.0;
        x = y = 0.0;
    }

    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        x = y = 0.0;
    }

    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setn(int n){
        if(n >= 3){
            this.n = n;
        }
    }

    public void setSide(double side){
        if(side >= 1.0){
            this.side = side;
        }
    }

    public void setx(double x){
        this.x = x;
    }
    public void sety(double y){
        this.y = y;
    }

    public int getn(){
        return n;
    }

    public double getSide(){
        return side;
    }

    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public double getPerimeter(){
        return side * n;
    }

    public double getArea(){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.toRadians(Math.PI / n)));
    }

    public static void main(String[] args) {
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6,4.0);
        RegularPolygon p3 = new RegularPolygon(10,4.0,5.6,7.8);
        
        System.out.println();
        System.out.println("Perimeter of p1 : " + p1.getPerimeter() + ", Area of p1 : " + p1.getArea());
        System.out.println();
        System.out.println("Perimeter of p2 : " + p2.getPerimeter() + ", Area of p2 : " + p2.getArea());
        System.out.println();
        System.out.println("Perimeter of p3 : " + p3.getPerimeter() + ", Area of p3 : " + p3.getArea());
    }
}
