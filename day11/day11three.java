package day11;
import java.util.Scanner;

public class day11three {
    public static int maximum(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        int max = maximum(a, b);
        System.out.println("The maximum number is: " + max);
        scanner.close();
    }
}
