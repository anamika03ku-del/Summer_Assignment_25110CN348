package day17;
import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {
    public static int[] intersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                if (temp.isEmpty() || temp.get(temp.size() - 1)!= arr1[i]) {
                    temp.add(arr1[i]);
                }
                i++; j++;
            }
        }

        int[] result = new int[temp.size()];
        for (int k = 0; k < temp.size(); k++) result[k] = temp.get(k);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 3, 5};
        int[] res = intersection(a, b); 
        System.out.print(Arrays.toString(res));
    }
}
