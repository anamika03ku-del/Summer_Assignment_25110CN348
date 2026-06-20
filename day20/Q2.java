package day20;

import java.util.Scanner;

public class Q2 {
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
        boolean isSymmetric = true;

         for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
                if(mat[i][j] != mat[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric)break;
        }
        if(isSymmetric){
            System.out.println("matrix is Symmetric");
        }else{
            System.out.println("matrix is not Symmetric");
        }
        sc.close();
    }
}