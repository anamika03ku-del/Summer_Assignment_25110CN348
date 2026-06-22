package day22;

public class Q2 {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) return 0;
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String s = "Java is fun to learn";
        System.out.println("Word count: " + countWords(s));
    }
}