import java.util.Scanner;

public class posn1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scan.nextInt();

        if (n >= 0) {
            System.out.println(n + " is a positive number");
        } else {
            System.out.println(n + " is a negative number");
        }
    }
}
