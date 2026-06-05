package day5;
import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            int factorial = 1;
            for(int i = 1; i <= digit; i++){
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
        sc.close();
    }
    
}
