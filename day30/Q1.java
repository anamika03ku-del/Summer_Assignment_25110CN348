package day30;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    float marks;
    
    Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}

public class Q1 {
    static Student[] students = new Student[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    
    static void addStudent() {
        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        students[count++] = new Student(roll, name, marks);
        System.out.println("Student Added!");
    }
    
    static void displayAll() {
        if(count == 0) { System.out.println("No records"); return; }
        System.out.println("\nRoll\tName\t\tMarks");
        for(int i = 0; i < count; i++) {
            System.out.printf("%d\t%s\t\t%.2f\n", students[i].roll, students[i].name, students[i].marks);
        }
    }
    
    static void searchStudent() {
        System.out.print("Enter Roll to search: ");
        int roll = sc.nextInt();
        for(int i = 0; i < count; i++) {
            if(students[i].roll == roll) {
                System.out.printf("Found: %d %s %.2f\n", students[i].roll, students[i].name, students[i].marks);
                return;
            }
        }
        System.out.println("Not found");
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("\n1.Add 2.Display 3.Search 4.Exit\nChoice: ");
            choice = sc.nextInt();
            if(choice == 1) addStudent();
            else if(choice == 2) displayAll();
            else if(choice == 3) searchStudent();
        } while(choice!= 4);
    }
}
