class Rectangle {

    int length;
    int breadth;


    public Rectangle(int len, int bre) {
        length = len;
        breadth = bre;
    }


    public void calculateArea() {

        System.out.println("Length of Rectangle: " + length);
        System.out.println("Breadth of Rectangle: " + breadth);


        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);


        rect.calculateArea();
    }
}
