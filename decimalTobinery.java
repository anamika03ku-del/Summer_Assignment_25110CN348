package day6;
import java.util.Scanner;

public class decimalTobinery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long decimalNum = sc.nextLong();
        long bineryNum = 0;
        long power = 1;
        long temp = decimalNum;

        while(temp > 0){
            long lastDigit = temp % 2;
            bineryNum = bineryNum + lastDigit * power;
            power *= 10;
            temp /= 2;
        }
        System.out.println(bineryNum);
        sc.close();
    }
    
}
