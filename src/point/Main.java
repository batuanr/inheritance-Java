package point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 5);
        Point3D point3D = new Point3D(3, 7, 9);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
        point3D.setXYZ(5, 6, 8);
        System.out.println(point3D.toString());
    }
}
