package day25;
import java.util.*;

public class Q3 {
    public static void sortNamesArray(String[] names) {
        Arrays.sort(names); 
    }
    
    public static void sortNamesList(List<String> names) {
        Collections.sort(names);
    }

    public static void main(String[] args) {
       
        String[] names = {"Zara", "Aman", "Riya", "Karan", "aman"};
        Arrays.sort(names);
        System.out.println("Array sort: " + Arrays.toString(names));
        
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive: " + Arrays.toString(names));
        
        List<String> nameList = new ArrayList<>(Arrays.asList("Zara", "Aman", "Riya"));
        Collections.sort(nameList);
        System.out.println("List sort: " + nameList);
    }
}