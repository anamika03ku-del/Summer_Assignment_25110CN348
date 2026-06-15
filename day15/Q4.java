package day15;

public class Q4 {
    public static void moveZerosToEnd(int[] arr){
        int nonZeroIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex++] = 0;
        }
    }
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros to the end: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
