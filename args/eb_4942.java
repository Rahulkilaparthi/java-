public class eb_4942 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of electricity unit.");
            return;
        }
        double units = Double.parseDouble(args[0]);
        double bill = 0;

        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        bill = bill + (bill * 0.20);
        System.out.println("Total electricity bill is: Rs. " + bill);
    }
}
