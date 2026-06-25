package day25;
import java.util.*;

public class Q2 {
    public static List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        
        
        for(String word : words) {
            int[] charCount = new int[26];
            for(char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            for(int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            while(minFreq[i]-- > 0) {
                result.add(String.valueOf((char)(i + 'a')));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
        
        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(commonChars(words2));
    }
}
