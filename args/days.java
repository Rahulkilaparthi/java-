import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a number (1-7) to get the day of the week:");

        // Read the input
        int dayNumber = scanner.nextInt();

        // Determine the day of the week
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid input! Please enter a number between 1 and 7.";
        }

        // Print the result
        System.out.println(day);

        // Close the scanner
        scanner.close();
    }

}