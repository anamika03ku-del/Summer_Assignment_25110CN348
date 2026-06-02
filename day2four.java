package day2;
import java.util.Scanner;

public class day2four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev =0;
        while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if(n == rev){
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome number");
        }
        sc.close();
    }
    
}
