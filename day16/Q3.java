package day16;

public class Q3 {
    public static boolean findPairWithSum(int[] arr, int targetSum){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == targetSum){
                    System.out.println("pair found: " + arr[i] + ", " + arr[j]);
                    return true;
                }
            }
        }
        System.out.println("No pair found with the given sum.");
        return false;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 7, 2, 8, 6}; 
        boolean found = findPairWithSum(arr, 10);
        if(found){
            System.out.println("A pair with the given sum exists.");
        } else {
            System.out.println("No pair with the given sum exists.");
        }
    }  
}

              