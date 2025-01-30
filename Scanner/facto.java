package Scanner;
import java.util.Scanner;
public class facto{
    public  static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the integer");
        int num=scanner.nextInt();
        if(num<0){
            System.out.println("please enter valid number.");
        }else{
            long factorial=1;
            for(int i=1;i<=num;i++){
                factorial *= i;
            }
            System.out.println("The factorial of "+num+ " is: "+factorial);
        }
    }
}