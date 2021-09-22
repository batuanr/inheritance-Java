package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        String color;
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("Enter color");
        color = scanner.nextLine();
        System.out.println("Nhập vào 3 cạnh tam giác");
        do {
            System.out.println("Enter side1");
            a = scanner.nextDouble();
            System.out.println("Enter side2");
            b = scanner.nextDouble();
            System.out.println("Enter side3");
            c = scanner.nextDouble();
            if (a >= b+c || b >= a+c || c >= a+b) {
                System.out.println("tam giác không tồn tại");
                System.out.println("xin nhập lại");
            }
        }while (a >= b+c || b >= a+c || c >= a+b);

        triangle.setColor(color);
        triangle.setSide1(a);
        triangle.setSide2(b);
        triangle.setSide3(c);
        System.out.println(triangle);
    }
}
