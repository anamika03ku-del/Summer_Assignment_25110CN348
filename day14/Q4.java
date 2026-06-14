package day14;

public class Q4 {
    public static void duplicateElements(int[] arr){
        System.out.print("Duplicate elements: ");
        boolean foundDuplicate = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break; 
                }
            }
        }
        if(!foundDuplicate){
            System.out.print("None");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 2, 3};
        duplicateElements(arr);
    }
    
}
