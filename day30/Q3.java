package day30;
    import java.util.Scanner;

class Employee {
    int empId;
    String name, dept;
    float salary;
    
    Employee(int empId, String name, float salary, String dept) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
}

public class Q3 {
    static Employee[] e = new Employee[100];
    static int empCount = 0;
    static Scanner sc = new Scanner(System.in);
    
    static void addEmployee() {
        System.out.print("Emp ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Salary: ");
        float salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Dept: ");
        String dept = sc.nextLine();
        e[empCount++] = new Employee(id, name, salary, dept);
        System.out.println("Employee Added!");
    }
    
    static void displayEmployees() {
        if(empCount == 0) { System.out.println("No employees"); return; }
        System.out.println("\nID\tName\t\tSalary\t\tDept");
        for(int i = 0; i < empCount; i++) {
            System.out.printf("%d\t%s\t\t%.2f\t%s\n", e[i].empId, e[i].name, e[i].salary, e[i].dept);
        }
    }
    
    static void searchByDept() {
        sc.nextLine();
        System.out.print("Enter Dept: ");
        String dept = sc.nextLine();
        boolean found = false;
        System.out.println("\nID\tName\t\tSalary");
        for(int i = 0; i < empCount; i++) {
            if(e[i].dept.equalsIgnoreCase(dept)) {
                System.out.printf("%d\t%s\t\t%.2f\n", e[i].empId, e[i].name, e[i].salary);
                found = true;
            }
        }
        if(!found) System.out.println("No employees in " + dept);
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("\n1.Add 2.Display All 3.Search by Dept 4.Exit\nChoice: ");
            choice = sc.nextInt();
            if(choice == 1) addEmployee();
            else if(choice == 2) displayEmployees();
            else if(choice == 3) searchByDept();
        } while(choice!= 4);
    }
}
