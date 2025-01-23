public class  vc_4942{
    public static void main(String[] args) {
        // Check if the user provided a character
        if (args.length == 0) {
            System.out.println("Please provide a character as a command-line argument.");
            return;
        }
        char ch = args[0].charAt(0);
        if (Character.isLetter(ch)) {
            ch = Character.toLowerCase(ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid alphabetic character.");
        }
    }
}
