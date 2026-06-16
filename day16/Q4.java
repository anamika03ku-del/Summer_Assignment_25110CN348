package day16;

public class Q4 {
    public static int removeDuplicates(int[] arr){
        if(arr.length == 0) return 0;
        int uniqueIndex = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[uniqueIndex++] = arr[i];
            }
        }
        return uniqueIndex; 
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 3, 3, 4, 5}; 
        int newLength = removeDuplicates(arr);
        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
