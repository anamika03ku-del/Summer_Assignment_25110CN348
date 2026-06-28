package day28;
 import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 50;
        int booked = 0;
        
        while (true) {
            System.out.println("\n1.Book Ticket 2.Cancel Ticket 3.Available Seats 4.Exit");
            System.out.println("Available: " + (totalSeats - booked) + "/" + totalSeats);
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("No. of tickets: ");
                int t = sc.nextInt();
                if (booked + t <= totalSeats) {
                    booked += t;
                    System.out.println(t + " tickets booked.");
                } else System.out.println("Not enough seats.");
            } else if (ch == 2) {
                System.out.print("No. of tickets to cancel: ");
                int t = sc.nextInt();
                if (t <= booked) {
                    booked -= t;
                    System.out.println(t + " tickets cancelled.");
                } else System.out.println("Invalid.");
            } else if (ch == 3) {
                System.out.println("Available: " + (totalSeats - booked));
            } else break;
        }
        sc.close();
    }
}
