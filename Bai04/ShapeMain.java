package BAITUAN9.Bai04;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle: " + rectangle); //Hien thi thong tin
        System.out.println("Area: " + rectangle.getArea()); //Dien tich
        System.out.println("Perimeter: " + rectangle.getPerimeter()); //Chu vi
        System.out.println("Is Square? " + rectangle.isSquare()); //Kiem tra hinh vuong

        Rectangle square = new Rectangle(5.0, 5.0);
        System.out.println("\nSquare: " + square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("Is Square? " + square.isSquare());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("\nTriangle: " + triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());

        Circle circle = new Circle(5.0);
        System.out.println("\nCircle: " + circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}