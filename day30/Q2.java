package day30;

import java.util.Scanner;

class Book {
    int id;
    String title, author;
    boolean available;
    
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }
}
public class Q2 {
    static Book[] lib = new Book[100];
    static int bookCount = 0;
    static Scanner sc = new Scanner(System.in);
    
    static void addBook() {
        System.out.print("Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        lib[bookCount++] = new Book(id, title, author);
        System.out.println("Book Added!");
    }
    
    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();
        for(int i = 0; i < bookCount; i++) {
            if(lib[i].id == id && lib[i].available) {
                lib[i].available = false;
                System.out.println("Book issued: " + lib[i].title);
                return;
            }
        }
        System.out.println("Book not available");
    }
    
    static void displayBooks() {
        System.out.println("\nID\tTitle\t\tAuthor\t\tStatus");
        for(int i = 0; i < bookCount; i++) {
            String status = lib[i].available? "Available" : "Issued";
            System.out.printf("%d\t%s\t\t%s\t\t%s\n", lib[i].id, lib[i].title, lib[i].author, status);
        }
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("\n1.Add Book 2.Issue Book 3.Display 4.Exit\nChoice: ");
            choice = sc.nextInt();
            if(choice == 1) addBook();
            else if(choice == 2) issueBook();
            else if(choice == 3) displayBooks();
        } while(choice!= 4);
    }
}
