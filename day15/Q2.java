package day15;
import java.util.Arrays;

public class Q2 {
    public static int RotateArrayleft(int[] arr){
        if(arr.length == 0) {
            return -1; 
        }
        int firstElement = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        return arr[0];
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        RotateArrayleft(arr);
        System.out.print("Array after left rotation: " + Arrays.toString(arr));
    }
}    
