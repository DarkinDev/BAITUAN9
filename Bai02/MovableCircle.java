package BAITUAN9.Bai02;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle[radius=" + radius + ", center=" + center.toString() + "]";
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
