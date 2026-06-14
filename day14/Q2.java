package day14;

public class Q2 {
    public static int frequency(int[] arr, int target){
        int count = 0;
        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 1};
        int target = 1;
        int result = frequency(arr, target);
        System.out.println("Frequency of " + target + " is: " + result);
    }
}