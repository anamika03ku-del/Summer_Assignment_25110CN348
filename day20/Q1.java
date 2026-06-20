package day20;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print(" Enter rows");
        int row = sc.nextInt();
        System.out.print(" Enter columns");
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int mul[][] =new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mul[i][j] = mul[i][j] + mat1[i][j] * mat2[i][j];
            }  
        }
    for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
         sc.close();
    }
}