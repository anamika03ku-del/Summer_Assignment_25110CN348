package day30;

import java.util.Scanner;

class Student {
    int roll; String name; float cgpa;
    Student(int roll, String name, float cgpa) {
        this.roll = roll; this.name = name; this.cgpa = cgpa;
    }
}

class Teacher {
    int id; String name, subject;
    Teacher(int id, String name, String subject) {
        this.id = id; this.name = name; this.subject = subject;
    }
}
public class Q4 {
    static Student[] students = new Student[50];
    static Teacher[] teachers = new Teacher[50];
    static int sCount = 0, tCount = 0;
    static Scanner sc = new Scanner(System.in);
    
    static void addStudent() {
        System.out.print("Roll: "); int roll = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("CGPA: "); float cgpa = sc.nextFloat();
        students[sCount++] = new Student(roll, name, cgpa);
        System.out.println("Student added");
    }
    
    static void addTeacher() {
        System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Subject: "); String subject = sc.nextLine();
        teachers[tCount++] = new Teacher(id, name, subject);
        System.out.println("Teacher added");
    }
    
    static void displayAll() {
        System.out.println("\n--- Students ---");
        for(int i = 0; i < sCount; i++)
            System.out.printf("%d %s %.2f\n", students[i].roll, students[i].name, students[i].cgpa);
        
        System.out.println("\n--- Teachers ---");
        for(int i = 0; i < tCount; i++)
            System.out.printf("%d %s %s\n", teachers[i].id, teachers[i].name, teachers[i].subject);
    }
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.print("\n1.Add Student 2.Add Teacher 3.Display All 4.Exit\nChoice: ");
            choice = sc.nextInt();
            if(choice == 1) addStudent();
            else if(choice == 2) addTeacher();
            else if(choice == 3) displayAll();
        } while(choice!= 4);
    }
}
