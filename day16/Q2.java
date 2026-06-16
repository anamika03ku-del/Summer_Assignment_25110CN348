package day16;

public class Q2 {
    public static int findDuplicateNumber(int[] arr){
        int n = arr.length - 1;
        int totalSum = n * (n + 1) / 2; 
        int arraySum = 0;
        for(int num : arr){
            arraySum += num;
        }
        return arraySum - totalSum; 
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5}; 
        int duplicateNumber = findDuplicateNumber(arr);
        System.out.println("The duplicate number is: " + duplicateNumber);
    }
    
}
