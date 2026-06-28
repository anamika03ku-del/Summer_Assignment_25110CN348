package day28;
    import java.util.*;

class Contact {
    String name, phone, email;
    
    Contact(String n, String p, String e) {
        name = n; phone = p; email = e;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Phone: " + phone + ", Email: " + email);
    }
}
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1.Add Contact 2.View All 3.Search 4.Delete 5.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            
            if (ch == 1) {
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Phone: "); String p = sc.nextLine();
                System.out.print("Email: "); String e = sc.nextLine();
                contacts.add(new Contact(n, p, e));
            } else if (ch == 2) {
                for (Contact c : contacts) c.display();
            } else if (ch == 3) {
                System.out.print("Enter name to search: ");
                String n = sc.nextLine();
                for (Contact c : contacts) {
                    if (c.name.equalsIgnoreCase(n)) c.display();
                }
            } else if (ch == 4) {
                System.out.print("Enter name to delete: ");
                String n = sc.nextLine();
                contacts.removeIf(c -> c.name.equalsIgnoreCase(n));
                System.out.println("Deleted if found.");
            } else break;
        }
        sc.close();
    }
}
