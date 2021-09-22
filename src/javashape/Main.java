package javashape;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6.5, "blue",true);
        Rectangle rectangle = new Rectangle(4, 8, "white", true );
        Square S = new Square(6, "red", false);
        System.out.println(c.toString());
        System.out.println(rectangle.toString());
        System.out.println(S.toString());
    }
}
