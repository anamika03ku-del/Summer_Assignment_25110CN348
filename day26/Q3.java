package day26;
import java.util.*;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        double balance = 10000;

        System.out.print("Enter PIN: ");
        if (sc.nextInt()!= pin) {
            System.out.println("Wrong PIN. Exit.");
            return;
        }

        while (true) {
            System.out.println("\n1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Balance: ₹" + balance);
            } else if (ch == 2) {
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                if (amt > balance) System.out.println("Insufficient funds");
                else { balance -= amt; System.out.println("Withdrawn. New balance: ₹" + balance); }
            } else if (ch == 3) {
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                balance += amt;
                System.out.println("Deposited. New balance: ₹" + balance);
            } else break;
        }
    }
}
