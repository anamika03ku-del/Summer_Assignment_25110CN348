package day26;
 import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] candidates = {"Alice", "Bob", "Charlie"};
        int[] votes = new int[3];

        while (true) {
            System.out.println("\n1. Vote\n2. Show Results\n3. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Candidates: 1.Alice 2.Bob 3.Charlie");
                System.out.print("Vote for: ");
                int v = sc.nextInt();
                if (v >= 1 && v <= 3) votes[v-1]++;
                else System.out.println("Invalid candidate");
            } else if (ch == 2) {
                System.out.println("\n--- Results ---");
                for (int i = 0; i < 3; i++)
                    System.out.println(candidates[i] + ": " + votes[i]);
            } else break;
        }
        sc.close();
    }
}