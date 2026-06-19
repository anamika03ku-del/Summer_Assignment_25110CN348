package day19;

import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter rows");
        int row = sc.nextInt();
        System.out.print(" Enter columns");
        int col = sc.nextInt();
        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int sub[][] = new int[row][col];

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
                sub[i][j] = mat1[i][j] - mat2[i][j];
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(sub[i][j] + " ");
            }
             System.out.println();
        }
       sc.close();   
    }
}