package day18;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("After descending sort: " + Arrays.toString(arr));
        sc.close();
    }
}