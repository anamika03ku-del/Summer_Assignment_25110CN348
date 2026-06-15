package day15;

public class Q1 {
    public static int reverseArray(int[] arr){
        int reversedNumber = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reversedNumber = reversedNumber * 10 + arr[i];
        }
        return reversedNumber;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int result = reverseArray(arr);
        System.out.println("Reversed number: " + result);
    }
    
}
