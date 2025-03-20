package BAITUAN9.Bai02;

public class MovableApp {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial point: " + point);

        point.moveUp();
        point.moveRight();
        System.out.println("After moving up and right: " + point);

        MovableCircle circle = new MovableCircle(point, 5);
        System.out.println("Initial circle: " + circle);

        circle.moveDown();
        circle.moveLeft();
        System.out.println("After moving down and left: " + circle);
    }
}