public class d_4942 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two floating-point numbers as command-line arguments.");
            return;
        }

        // Parse the input arguments
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Truncate both numbers to 3 decimal places
        num1 = Math.floor(num1 * 1000) / 1000;
        num2 = Math.floor(num2 * 1000) / 1000;

        // Compare the truncated numbers
        if (num1 == num2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }
    }
}
