package day26;
 import java.util.*;

class Question {
    String ques, optA, optB, optC, optD;
    char ans;
    Question(String q, String a, String b, String c, String d, char ans) {
        ques=q; optA=a; optB=b; optC=c; optD=d; this.ans=ans;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] quiz = {
            new Question("Java is ___", "OOP", "Procedural", "Both", "None", 'A'),
            new Question("Size of int in Java?", "2", "4", "8", "Depends", 'B'),
            new Question("Which is not keyword?", "static", "try", "get", "new", 'C')
        };

        int score = 0;
        for (int i = 0; i < quiz.length; i++) {
            Question q = quiz[i];
            System.out.println("\nQ" + (i+1) + ": " + q.ques);
            System.out.println("A. " + q.optA + " B. " + q.optB);
            System.out.println("C. " + q.optC + " D. " + q.optD);
            System.out.print("Your answer: ");
            char user = sc.next().toUpperCase().charAt(0);
            if (user == q.ans) {
                System.out.println("Correct!");
                score++;
            } else System.out.println("Wrong. Ans: " + q.ans);
        }
        System.out.println("\nFinal Score: " + score + "/" + quiz.length);
        sc.close();
    }
}
