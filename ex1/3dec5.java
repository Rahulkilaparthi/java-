import java.util.Scanner;
class 3dec5{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        float n=scan.nextFloat();
        float n1=scan.nextFloat();
        int n2=(int)(n*1000);
        int n3=(int)(n1*1000);
        if(n2==n3){
            System.out.println("both numbers are same up to three decimals.");
            
        }else{
            System.out.println("both numbers are not same up to three deccimals.");
        }
    }
}