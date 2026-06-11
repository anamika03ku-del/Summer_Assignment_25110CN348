package day4;
import java.util.Scanner;

public class day4ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int num = start; num <= end; num++){
            if(num==0){
                System.out.println("0 is an Armstrong number.");
                continue;
            }
            int temp = num;
            int count = num;
            int sum = 0;
           int digits = 0;
           
           while(count > 0){
               digits++;
               count /= 10;
            }
            while(temp>0){
             int digit = temp % 10;
                int power = 1;
                for(int i = 1; i <= digits; i++){
                    power *= digit;
                }
                sum += power;
                temp /= 10;
            }
            
            if(sum == num){
                System.out.println(num + " is an Armstrong number.");
            
        }
        sc.close();
    }
    }
}
    

