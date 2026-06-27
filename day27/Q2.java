package day27;
 import java.util.*;

class Employee {
    int id;
    String name, dept;
    
    Employee(int i, String n, String d) {
        id = i; name = n; dept = d;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + dept);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1.Add Employee 2.View All 3.Delete 4.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Dept: "); String d = sc.nextLine();
                empList.add(new Employee(id, n, d));
            } else if (ch == 2) {
                for (Employee e : empList) e.display();
            } else if (ch == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                empList.removeIf(e -> e.id == id);
                System.out.println("Deleted if found.");
            } else break;
        }
    }
}
