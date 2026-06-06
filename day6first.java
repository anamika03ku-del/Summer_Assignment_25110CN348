package day6;
import java.util.Scanner;

public class day6first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bineryNum = sc.nextLong();
        long decimalNum = 0;
        long power = 1;
        long temp = bineryNum;

        while(temp > 0){
            long lastDigit = temp % 10;
            decimalNum = decimalNum + lastDigit * power;
            power *= 2;
            temp /= 10;
        }
        System.out.println(decimalNum);
        sc.close();
    }
}
