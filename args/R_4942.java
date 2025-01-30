

public class R_4942 {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("please enter number.");
            return;
        }
        int age =Integer.parseInt(args[0]);
        if(age>=18 && age<=120){
            System.out.println("you are eligible to work.");
        }else{
            System.out.println("you are  not eligible to  work.");
        }

    }
}
