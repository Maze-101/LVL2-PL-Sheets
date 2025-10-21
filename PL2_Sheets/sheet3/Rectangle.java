package sheet3;

public class Rectangle {
    private double width , height;

    Rectangle(){
        width = height = 1.0;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public void showDimensions(){
        System.out.printf("Width : %.3f , Height : %.3f\n", width, height);
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * ( width + height );
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40);
        Rectangle r2 = new Rectangle(3.5,35.9);

        System.out.println("--- Dimensions of r1 ---");
        System.out.println();

        r1.showDimensions();

        System.out.printf("Area : %.3f , Perimeter : %.3f\n", r1.getArea(), r1.getPerimeter());
        System.out.println();

        System.out.println("--- Dimensions of r2 ---");
        System.out.println();
        
        r2.showDimensions();

        System.out.printf("Area : %.3f , Perimeter : %.3f\n", r2.getArea(), r2.getPerimeter());
    }
}
