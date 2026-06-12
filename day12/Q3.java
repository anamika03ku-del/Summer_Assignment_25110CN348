package day12;

public class Q3 {
    public static void fibonacci(int n){
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }
    public static void main(String[] args){
        fibonacci(10);
    }
    
}