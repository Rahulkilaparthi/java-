import java.util.Scanner;
class s_a8{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 numbers to find sum and average.");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        int n4=scan.nextInt();
        int n5=scan.nextInt();
        int sum=n1+n2+n3+n4+n5;
        double avg=sum/5;
        System.out.println("the sum of  5 numbers: "+ sum);
        System.out.println("the average of 5 numbers: "+avg);
    }
}