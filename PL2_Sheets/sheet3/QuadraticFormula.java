package sheet3;
import java.util.*;

public class QuadraticFormula {
    private double a,b,c;

    public QuadraticFormula(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double geta(){
        return a;
    }

    public double getb(){
        return b;
    }

    public double getc(){
        return c;
    }

    public double getDiscriminant(){
        return (b * b - 4 * a * c);
    }

    public double getRoot1(){
        if(getDiscriminant() < 0) {
            return 0;
        }
        return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));
    }

    public double getRoot2(){
        if(getDiscriminant() < 0) {
            return 0;
        }
        return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double a, b, c;

        System.out.print("Enter a b c : ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();

        QuadraticFormula eq = new QuadraticFormula(a, b, c);

        if(eq.getDiscriminant() < 0){
            System.out.println("The equation has no roots.");
        }
        else if(eq.getDiscriminant() == 0){
            System.out.println("X = " + eq.getRoot1());
        }
        else {
            System.out.println("X1 = " + eq.getRoot1() + ", X2 = " + eq.getRoot2());
        }

        s.close();
    }
}
