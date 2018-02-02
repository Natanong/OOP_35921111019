package oop_lab8;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20,30);

        System.out.println("Area of rectangle: "+rectangle.findArea());

        Circle circle = new Circle(15);
        System.out.println("Area of circle: "+circle.findArea());
    }//main
}//class
