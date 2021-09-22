package point2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 7);
        MovablePoint movablePoint = new MovablePoint(3, 4, 5, 6);
        System.out.println(point);
        System.out.println(point.toString());
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
