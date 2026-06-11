package day7;

public class day7four {
    public static int rev = 0;
    public static int printReverse(int n){
        if(n == 0){
            return rev;
        }
        int rem = n%10;
        rev = rev*10 + rem;
        return printReverse(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        int result = printReverse(n);
        System.out.println(result);
    }
}
        
