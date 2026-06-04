package day4;
import java.util.Scanner;

public class day4fibonaccirange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int a = 0, b = 1;
        while(a <= end){
            if(a >= start){
                System.out.print(a + " ");
            }
            int c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
    
}
