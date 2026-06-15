package day15;

public class Q3 {
    public static void rotateArrayRight(int[] arr){
        if(arr.length == 0) {
            return; 
        }
        int lastElement = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        rotateArrayRight(arr);
        System.out.print("Array after right rotation: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }    
}
