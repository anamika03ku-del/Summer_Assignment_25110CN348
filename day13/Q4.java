package day13;

public class Q4 {
    public static void EvenOdd(int[] arr){
       int even = 0, odd = 0;
       for(int num : arr){
           if(num % 2 == 0){
               even++;
           } else {
               odd++;
           }
       }
       System.out.println("Even numbers: " + even);
       System.out.println("Odd numbers: " + odd);
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        EvenOdd(arr);
    }
}
