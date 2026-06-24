package day24;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> seen = new LinkedHashSet<>();
        
        for(char c : str.toCharArray()) {
            seen.add(c);
        }
        
        StringBuilder res = new StringBuilder();
        for(char c : seen) res.append(c);
        
        System.out.println("After removing duplicates: " + res);
    }
}
