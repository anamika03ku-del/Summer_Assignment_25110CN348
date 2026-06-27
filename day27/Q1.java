package day27;
import java.util.*;
class Student {
    int rollNo;
    String name;
    double marks;
    
    Student(int r, String n, double m) {
        rollNo = r; name = n; marks = m;
    }
    
    void display() {
        System.out.println("Roll: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1.Add 2.Display All 3.Search 4.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Roll No: "); int r = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Marks: "); double m = sc.nextDouble();
                list.add(new Student(r, n, m));
            } else if (ch == 2) {
                for (Student s : list) s.display();
            } else if (ch == 3) {
                System.out.print("Enter Roll No: ");
                int r = sc.nextInt();
                for (Student s : list) {
                    if (s.rollNo == r) { s.display(); break; }
                }
            } else break;
        }
    }
}
