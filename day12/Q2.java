package day12;

public class Q2 {
    public static boolean Armatrong(int num){
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; 
            sum += digit * digit * digit; 
            num /= 10; 
        }

        return originalNum == sum;
    }
    public static void main(String[] args){
        System.out.println(Armatrong(153));
        System.out.println(Armatrong(154));
    }
    
}
