package day25;
import java.util.*;

public class Q4 {
    public static void sortByLength(List<String> words) {
        words.sort(Comparator.comparingInt(String::length));
    }
    
   
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(
            Arrays.asList("apple", "a", "banana", "cat", "dog", "hi")
        );
        
        sortByLength(words);
        System.out.println(words);
    }
}
