public class u_4942 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a character.");
            return;
        }
        char ch = args[0].charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
