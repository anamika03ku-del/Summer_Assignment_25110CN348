package day3;
import java.util.Scanner;

public class day3second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        for(int num = num1; num <= num2; num++){
            count = 0;
            for(int i = 1; i <= num; i++){
                if(num % i == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(num + " is a prime number");
            }
        }
        
        sc.close();
    }
}
