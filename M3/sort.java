

import java.util.Arrays;
import java.util.Scanner;
public class sort {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int[] marks= new int[10];
        System.out.println("enter the marks of  10 students:");
        for (int i=0;i<10;i++){
            System.out.println("Students "+(i+1)+ ":");
            marks[i]=scan.nextInt();
        }
        Arrays.sort(marks);
        System.out.println("\n marks in  sorted order:");
        for (int i=0;i<10;i++){
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
            
        }

    }
    
}
