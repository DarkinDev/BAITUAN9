package BAITUAN9.Bai03;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Initial Circle: " + circle);
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("\nInitial ResizableCircle: " + resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());

        resizableCircle.resize(50);
        System.out.println("\nAfter resizing (50%): " + resizableCircle);
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("Area: " + resizableCircle.getArea());
    }
}
