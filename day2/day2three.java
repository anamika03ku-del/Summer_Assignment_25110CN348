package day2;
import java.util.Scanner;
public class day2three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :  ");
        int n = sc.nextInt();
        int reverse = 0;
        while(n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        System.out.println("the reverse of the number is: " + reverse);
        sc.close();
        
    }
    
}
