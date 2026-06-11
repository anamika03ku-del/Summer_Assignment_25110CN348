package day6;
import java.util.Scanner;

public class day6four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base n");
        int n = sc.nextInt();
        System.out.println("Enter power p");
        int p = sc.nextInt();

        long result = 1;
        for(int i = 0; i < p; i++){
            result *= n;
        }
        System.out.println(result);
        sc.close();
    }
}
