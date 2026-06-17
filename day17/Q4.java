package day17;
import java.util.*;

public class Q4{
public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        Set<Integer> set1 = new HashSet<>();
        for(int num : arr1) set1.add(num);

        Set<Integer> common = new HashSet<>();
        for(int num : arr2) {
            if(set1.contains(num)) {
                common.add(num);
            }
        }
        System.out.println("Common elements: " + common); 
    }
}

}



