import java.util.Scanner;
public class sumd{
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scanner.nextInt();
        int sum=0;
        int temp=Math.abs(num);
        while (temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("The sum of  digits of "+num+" is "+sum);
    } 
}