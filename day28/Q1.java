package day28;
    import java.util.*;

class Book {
    int id;
    String title, author;
    boolean isIssued;
    
    Book(int i, String t, String a) {
        id = i; title = t; author = a; isIssued = false;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + 
                           ", Status: " + (isIssued ? "Issued" : "Available"));
    }
}
public class Q1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("\n1.Add Book 2.Display All 3.Issue Book 4.Return Book 5.Exit");
            int ch = sc.nextInt();
            
            if (ch == 1) {
                System.out.print("Book ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Title: "); String t = sc.nextLine();
                System.out.print("Author: "); String a = sc.nextLine();
                books.add(new Book(id, t, a));
            } else if (ch == 2) {
                for (Book b : books) b.display();
            } else if (ch == 3) {
                System.out.print("Enter Book ID to issue: ");
                int id = sc.nextInt();
                for (Book b : books) {
                    if (b.id == id && !b.isIssued) {
                        b.isIssued = true;
                        System.out.println("Book issued.");
                        break;
                    }
                }
            } else if (ch == 4) {
                System.out.print("Enter Book ID to return: ");
                int id = sc.nextInt();
                for (Book b : books) {
                    if (b.id == id && b.isIssued) {
                        b.isIssued = false;
                        System.out.println("Book returned.");
                        break;
                    }
                }
            } else break;
        }
        sc.close();
    }
}
