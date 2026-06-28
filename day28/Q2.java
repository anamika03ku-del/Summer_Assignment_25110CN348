package day28;

    import java.util.*;

class Account {
    int accNo;
    String name;
    double balance;
    
    Account(int a, String n, double b) {
        accNo = a; name = n; balance = b;
    }
    
    void deposit(double amt) { balance += amt; }
    
    void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance");
    }
    
    void display() {
        System.out.println("Acc: " + accNo + ", Name: " + name + ", Balance: ₹" + balance);
    }
}
public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        
        System.out.print("Enter Acc No: "); int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: "); String n = sc.nextLine();
        System.out.print("Initial Balance: "); double b = sc.nextDouble();
        acc = new Account(a, n, b);
        
        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Amount: ");
                acc.deposit(sc.nextDouble());
                System.out.println("Deposited.");
            } else if (ch == 2) {
                System.out.print("Amount: ");
                acc.withdraw(sc.nextDouble());
            } else if (ch == 3) {
                acc.display();
            } else break;
        }
        sc.close();
    }
}
