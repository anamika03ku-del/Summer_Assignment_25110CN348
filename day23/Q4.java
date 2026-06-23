package day23;

public class Q4 {
    public static char maxOccurring(String str) {
        int[] freq = new int[256];
        int max = 0;
        char result = ' ';
        
        for (char ch : str.toCharArray()) {
            freq[ch]++;
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxOccurring("apple"));
    }
}
