package day21;

public class Q2 {
    public static void main(String[] args) {
        String str = "Annu";
        String rev = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);
    }
}
