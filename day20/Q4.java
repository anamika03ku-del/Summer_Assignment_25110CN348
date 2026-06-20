package day20;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        System.out.println("Enter matrix elements:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Column-wise sum:");
        for(int j=0; j<cols; j++){ 
            int colSum = 0;
            for(int i=0; i<rows; i++){ 
                colSum += mat[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + colSum);
        }
        sc.close();
    }
}