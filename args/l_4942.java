public class l_4942 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please enter three numbers as arguments.");
            return;
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int largest = n1;
        if (n2 > largest) {
            largest = n2;
        }
        if (n3 > largest) {
            largest = n3;
        }

        System.out.println("The largest number is: " + largest);
    }
}
