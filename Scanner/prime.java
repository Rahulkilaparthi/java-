package Scanner;
import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=scanner.nextInt();
        boolean isPrime=true;
        if(num <=1){
            isPrime=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+ " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }
    }
}