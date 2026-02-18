import java.util.Scanner;
public class CalculatorRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.err.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }
}
