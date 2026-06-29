package day29;
import java.util.*;

    public class Q2 {
    static void display(int[] arr) {
        System.out.print("Array: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        while (true) {
            System.out.println("\n1.Display 2.Insert 3.Delete 4.Search 5.Sort 6.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                display(arr);
            } else if (ch == 2) {
                System.out.print("Element & Position: ");
                int ele = sc.nextInt(), pos = sc.nextInt();
                int[] newArr = new int[arr.length + 1];
                for (int i = 0, j = 0; i < newArr.length; i++) {
                    if (i == pos) newArr[i] = ele;
                    else newArr[i] = arr[j++];
                }
                arr = newArr;
                System.out.println("Inserted.");
            } else if (ch == 3) {
                System.out.print("Position to delete: ");
                int pos = sc.nextInt();
                int[] newArr = new int[arr.length - 1];
                for (int i = 0, j = 0; i < arr.length; i++) {
                    if (i!= pos) newArr[j++] = arr[i];
                }
                arr = newArr;
                System.out.println("Deleted.");
            } else if (ch == 4) {
                System.out.print("Element to search: ");
                int ele = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == ele) {
                        System.out.println("Found at index " + i);
                        found = true; break;
                    }
                }
                if (!found) System.out.println("Not found");
            } else if (ch == 5) {
                Arrays.sort(arr);
                System.out.println("Sorted.");
            } else break;
        }
        sc.close();
    }
}
