package day27;
 import java.util.*;

class Salary {
    int empId;
    String name;
    double basic, hra, da, gross;
    
    Salary(int id, String n, double b) {
        empId = id; name = n; basic = b;
        hra = 0.2 * basic; 
        da = 0.1 * basic;
        gross = basic + hra + da;
    }
    
    void display() {
        System.out.println("ID: " + empId + ", Name: " + name);
        System.out.println("Basic: " + basic + ", HRA: " + hra + ", DA: " + da);
        System.out.println("Gross Salary: " + gross + "\n");
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Salary> list = new ArrayList<>();
        
        while (true) {
            System.out.println("1.Add Salary 2.Display All 3.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Emp ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Basic: "); double b = sc.nextDouble();
                list.add(new Salary(id, n, b));
            } else if (ch == 2) {
                for (Salary s : list) s.display();
            } else break;
        }
    }
}
