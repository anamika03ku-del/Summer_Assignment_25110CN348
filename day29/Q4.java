package day29;
 import java.util.*;

class Item {
    int id, qty;
    String name;
    double price;
    
    Item(int i, String n, int q, double p) {
        id = i; name = n; qty = q; price = p;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Qty: " + qty + ", Price: ₹" + price);
    }
}

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Item> inventory = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1.Add Item 2.View All 3.Update Stock 4.Search 5.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: "); String n = sc.nextLine();
                System.out.print("Qty: "); int q = sc.nextInt();
                System.out.print("Price: "); double p = sc.nextDouble();
                inventory.add(new Item(id, n, q, p));
            } else if (ch == 2) {
                if (inventory.isEmpty()) System.out.println("No items");
                for (Item i : inventory) i.display();
            } else if (ch == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                for (Item i : inventory) {
                    if (i.id == id) {
                        System.out.print("New Qty: ");
                        i.qty = sc.nextInt();
                        System.out.println("Updated.");
                        break;
                    }
                }
            } else if (ch == 4) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                for (Item i : inventory) {
                    if (i.id == id) { i.display(); break; }
                }
            } else break;
        }
        sc.close();
    }
}
