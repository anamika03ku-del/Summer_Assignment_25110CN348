package day2;
import java.util.Scanner;

public class day2first {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :  ");
        int n = sc.nextInt();
        System.out.println("enter number 2: ");
        int m = sc.nextInt();
        int sum = n + m;
        System.out.println("the sum of " + n + " and " + m + " is: " + sum);
        sc.close();
    }

    
}
