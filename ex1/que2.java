import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for a (a cannot be 0):");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation. 'a' cannot be 0.");
        } else {
            System.out.println("Enter value for b:");
            double b = scanner.nextDouble();

            System.out.println("Enter value for c:");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two real roots:");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The equation has one real root:");
                System.out.println("Root = " + root);
            } else {
                System.out.println("The equation has no real roots (complex roots).");
            }
        }
    }
}
