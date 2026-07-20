
class Shape {

    public double area(double radius) {
        return Math.PI * radius * radius; // Formula: πr²
    }


    public double area(double length, double breadth) {
        return length * breadth; // Formula: Length × Breadth
    }


    public double area(float base, float height) {
        return 0.5 * base * height;
    }
}


public class AreaCalculation {
    public static void main(String[] args) {
        Shape shape = new Shape();


        double circleRadius = 5.0;
        double circleArea = shape.area(circleRadius);
        System.out.printf("Area of Circle with radius %.2f is: %.4f\n", circleRadius, circleArea);


        double rectLength = 10.0;
        double rectBreadth = 5.0;
        double rectArea = shape.area(rectLength, rectBreadth);
        System.out.printf("Area of Rectangle with dimensions %.2f x %.2f is: %.2f\n", rectLength, rectBreadth, rectArea);


        float triBase = 6.0f;
        float triHeight = 8.0f;
        double triArea = shape.area(triBase, triHeight);
        System.out.printf("Area of Triangle with base %.2f and height %.2f is: %.2f\n", triBase, triHeight, triArea);
    }
}