package day6;
import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(temp > 0){
            int lastBit = temp & 1;
            if(lastBit == 1){
                count++;
            }
            temp = temp >> 1;
        }
        System.out.println(count);
        sc.close();
    }
}
