package day19;

import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter rows");
        int row = sc.nextInt();
        System.out.print(" Enter columns");
        int col = sc.nextInt();
        int mat[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int j=0; j<col; j++){
            for(int i=0; i<row; i++){
                System.out.print(mat[i][j] + " ");;
            }
            System.out.println();
        }
        sc.close();

    }
}
