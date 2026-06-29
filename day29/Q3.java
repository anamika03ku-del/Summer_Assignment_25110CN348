package day29;
 import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        while (true) {
            System.out.println("\n1.Length 2.Reverse 3.Palindrome 4.To Upper 5.To Lower 6.Count Vowels 7.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.println("Length: " + str.length());
            } else if (ch == 2) {
                String rev = new StringBuilder(str).reverse().toString();
                System.out.println("Reverse: " + rev);
            } else if (ch == 3) {
                String rev = new StringBuilder(str).reverse().toString();
                if (str.equalsIgnoreCase(rev)) System.out.println("Palindrome");
                else System.out.println("Not Palindrome");
            } else if (ch == 4) {
                System.out.println("Upper: " + str.toUpperCase());
            } else if (ch == 5) {
                System.out.println("Lower: " + str.toLowerCase());
            } else if (ch == 6) {
                int count = 0;
                for (char c : str.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(c)!= -1) count++;
                }
                System.out.println("Vowels: " + count);
            } else break;
        }
        sc.close();
    }
}
