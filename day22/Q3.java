package day22;
import java.util.HashMap;

public class Q3 {
    
    public static void printFrequency(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : freq.keySet()) {
            System.out.println(ch + ": " + freq.get(ch));
        }
    }

    public static void main(String[] args) {
        printFrequency("programming");
    }
}
