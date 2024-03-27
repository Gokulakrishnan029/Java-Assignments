package assignment;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.area());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Parallelogram parallelogram = new Parallelogram(3, 7);
        System.out.println("Area of Parallelogram: " + parallelogram.area());

        Square squareAsRectangle = new Square(5);
        System.out.println("Area of Square modeled as Rectangle: " + squareAsRectangle.area());
    }
}
