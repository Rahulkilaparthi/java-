import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter year:");
        int n=scan.nextInt();
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.println(n+": is a leap year.");
        }else{
            System.out.println(n+": is not a leap year.");
        }
    }
}