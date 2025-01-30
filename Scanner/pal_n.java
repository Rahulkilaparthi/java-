package Scanner;
import java.util.Scanner;

public class pal_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        int reversedNum = 0, originalNum = num;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;  
            num /= 10;  
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
