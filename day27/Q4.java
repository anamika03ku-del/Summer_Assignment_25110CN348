package day27;
 import java.util.*;

class Marksheet {
    String name;
    int rollNo;
    int[] marks = new int[5];
    int total;
    double percent;
    char grade;
    
    void input(Scanner sc) {
        System.out.print("Name: "); name = sc.nextLine();
        System.out.print("Roll No: "); rollNo = sc.nextInt();
        System.out.println("Enter marks for 5 subjects:");
        total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        percent = total / 5.0;
        if (percent >= 90) grade = 'A';
        else if (percent >= 75) grade = 'B';
        else if (percent >= 60) grade = 'C';
        else if (percent >= 40) grade = 'D';
        else grade = 'F';
    }
    
    void display() {
        System.out.println("\n--- MARKSHEET ---");
        System.out.println("Name: " + name + " | Roll: " + rollNo);
        System.out.print("Marks: ");
        for (int m : marks) System.out.print(m + " ");
        System.out.println("\nTotal: " + total + "/500");
        System.out.println("Percentage: " + percent + "%");
        System.out.println("Grade: " + grade);
        System.out.println("-----------------\n");
    }
}
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Marksheet m = new Marksheet();
        m.input(sc);
        m.display();
    }
}
