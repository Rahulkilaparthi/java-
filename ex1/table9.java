import java.util.Scanner;

class table9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the number
        System.out.print("Enter an integer to display its multiplication table: ");
        int number = scan.nextInt();

        // Display the multiplication table
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scan.close();
    }
}
