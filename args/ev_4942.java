public class ev_4942 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }
        double number = Double.parseDouble(args[0]);
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }
}
