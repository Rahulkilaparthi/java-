
import java.util.Arrays;
import java.util.Scanner;
public class namesort {
    public static  void main(String[] args){
        Scanner scan =new Scanner(System.in);
        String[] names=new String[7];
        System.out.println("enter the names of 7 students:");
        for(int i=0;i<7;i++){
            names[i]=scan.nextLine();
        }
        Arrays.sort(names);
        System.out.println("sorted names:");
        for (String name : names){
            System.out.println(name);
        }

    }
    
}
