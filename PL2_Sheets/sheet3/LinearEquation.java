package sheet3;
import java.util.Scanner;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        double f = s.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() +
                    " and y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
        
        s.close();
    }
}
