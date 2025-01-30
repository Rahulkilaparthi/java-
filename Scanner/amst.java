package Scanner;
import java.util.Scanner;
public class amst{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number.");
        int num=scanner.nextInt();
        int n1=num;
        int sum=0;
        int digits = String.valueOf(num).length();
        while (num!=0){
            int digit=num%10;
            sum +=Math.pow(digit,digits);
            num/=10;
        }
        if(sum==n1){
            System.out.println(n1 + " is an armstrong number.");
        }else{
            System.out.println(n1 +" is not an amstrong number.");
        }
    }
}