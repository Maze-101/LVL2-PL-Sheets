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
        System.out.printf("Width : %.3f , Height : %.3f", width, height);
    }

    public double getArea(double width, double height){
        return width * height;
    }

    public double getPerimeter(double width, double height){
        return 2 * ( width + height );
    }
}
