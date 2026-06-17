package day17;

public class Q1 {
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while(i < n1){
            mergedArray[k++] = arr1[i++];
        }
        while(j < n2){
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    public static void main(String args[]){
        int[] a ={1,3,5,7};
        int[] b ={2,4,6,8};
        int[] result =mergeArrays(a, b);
        System.out.print("merged :");
        for(int num : result){
            System.out.print(num + " ");
        }

    }
    
}
