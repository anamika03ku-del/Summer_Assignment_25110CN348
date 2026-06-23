package day23;
 import java.util.HashSet;

public class Q2 {
   

    public static char firstRepeating(String str) {
        HashSet<Character> seen = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) return ch;
            seen.add(ch);
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstRepeating("abcdedba"));
    }
}
