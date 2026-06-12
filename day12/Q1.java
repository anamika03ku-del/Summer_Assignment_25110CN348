package day12;

public class Q1 {
    public static boolean palindrome(int num){
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit; 
            num /= 10; 
        }

        return originalNum == reversedNum;
    }
    public static void main(String[] args){
        System.out.println(palindrome(121));
        System.out.println(palindrome(-121)); 
    }
    
}
