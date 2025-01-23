import java.util.Scanner;

public class ntri10 {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Input number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Loop to print the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();  // Move to the next line after each row
        }
        
        scanner.close();
    }
}
