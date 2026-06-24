package day24;

public class Q3 {
    public static void main(String[] args) {
        String sentence = "Java is used by Microsoft";
        String[] words = sentence.split(" ");
        String longest = "";
        
        for(String word : words) {
            if(word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}