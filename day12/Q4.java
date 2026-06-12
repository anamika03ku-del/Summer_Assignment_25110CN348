package day12;

public class Q4 {
    public static boolean perfectNum(int num){
        if (num <= 1) {
            return false; 
        }
        int sum = 1;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                    sum += i;
            }
        }
        return sum == num; 
    }
    public static void main(String[] args){
        System.out.println(perfectNum(28));
        System.out.println(perfectNum(12));
    }

}
