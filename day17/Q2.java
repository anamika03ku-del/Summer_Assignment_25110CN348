package day17;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    public static int[] union(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            // Skip duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                temp.add(arr1[i++]);
            } else if (arr2[j] < arr1[i]) {
                temp.add(arr2[j++]);
            } else {
                temp.add(arr1[i]);
                i++; j++;
            }
        }
        while (i < n1) {
            if (i == 0 || arr1[i]!= arr1[i - 1]) temp.add(arr1[i]);
            i++;
        }
        while (j < n2) {
            if (j == 0 || arr2[j]!= arr2[j - 1]) temp.add(arr2[j]);
            j++;
        }

        // Convert to array
        int[] result = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) result[k] = temp.get(k);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};
        int[] res = union(a, b); 
        System.out.println(Arrays.toString(res));
    }
}
