public class x_4942 {
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("Please provide a character as a command-line argument.");
            return;
        }
        char ch = args[0].charAt(0);
        if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}
