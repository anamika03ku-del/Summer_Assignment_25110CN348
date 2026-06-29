package day29;
    import java.util.*;
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- CALCULATOR ---");
            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus 6.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            
            if (ch == 6) break;
            if (ch < 1 || ch > 5) {
                System.out.println("Invalid choice");
                continue;
            }
            
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            
            switch (ch) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                case 3: System.out.println("Result: " + (a * b)); break;
                case 4: 
                    if (b!= 0) System.out.println("Result: " + (a / b));
                    else System.out.println("Cannot divide by zero");
                    break;
                case 5: System.out.println("Result: " + (a % b)); break;
            }
        }
        sc.close();
    }
}
