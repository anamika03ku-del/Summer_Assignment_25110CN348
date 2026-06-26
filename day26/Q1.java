 package day26;
 import java.util.*;
 public class Q1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        int attempts = 7;

        System.out.println("Guess the number between 1-100. You have " + attempts + " tries.");

        while (attempts > 0) {
            System.out.print("Enter guess: ");
            int guess = sc.nextInt();
            attempts--;

            if (guess == target) {
                System.out.println("Correct! You won.");
                return;
            } else if (guess < target) {
                System.out.println("Too low. " + attempts + " attempts left.");
            } else {
                System.out.println("Too high. " + attempts + " attempts left.");
            }
        }
         System.out.println("Out of attempts. Number was: " + target);
    }
}