package day7;
public class day7three {
    public static int printsum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + printsum(n/10);
    }
    public static void main(String[] args) {
        int n = 1234;
        int result = printsum(n);
        while(result >= 10){
            result = printsum(result);
        }
        System.out.println(result);
    }
        
}
