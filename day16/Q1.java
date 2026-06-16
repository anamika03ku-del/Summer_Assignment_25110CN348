package day16;

public class Q1 {
    public static int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2; 
        int arraySum = 0;
        for(int num : arr){
            arraySum += num;
        }
        return totalSum - arraySum; 
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10}; 
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }    
}
