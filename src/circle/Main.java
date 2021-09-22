package circle;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5, "blue");
        Cylinder cylinder = new Cylinder(5, "red", 6);
        System.out.println(c.toString());
        System.out.println(cylinder.toString());
        System.out.println(c.getArea());
        System.out.println(cylinder.getVolume());
    }
}
