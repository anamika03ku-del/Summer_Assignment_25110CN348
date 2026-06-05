package day5;
import java.util.Scanner;

public class largestPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int largestPrime = 1;
        for(int i = 2; i <= num; i++){
            while(num % i == 0){
                largestPrime = i;
                num /= i;
            }
        }
         System.out.println("The largest prime factor is: " + largestPrime);
        
        sc.close();
    }
    
}
