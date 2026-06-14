package day14;

public class Q3 {
    public static int secondLargest(int[] arr){
        if(arr.length < 2){
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 1, 4, 2};
        int result = secondLargest(arr);
        System.out.println("Second largest element is: " + result);
    }

    
}
