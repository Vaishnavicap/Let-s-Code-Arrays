//Write a program for matrix addition and matrix multiplication.
package codearrays;

import java.util.Scanner;

public class CodeArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Rows for A[] : ");

        //User input for numders of Rows
        int r = input.nextInt();

        System.out.println("Enter the number of Columns for A[] : ");

        //User input for numders of Columns
        int c = input.nextInt();
        
        // Array A[][] and B[][]
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int M[][] = new int[r][c];

        System.out.println("Enter the values for A[][] : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter the number for " + (i + 1) + " Row &" + (j + 1) + " Column postion : ");
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the values for B[][] : ");
        for (int m = 0; m < r; m++) {
            for (int n = 0; n < c; n++) {
                System.out.println("Enter the number for " + (m + 1) + " Row &" + (n + 1) + " Column postion : ");
                B[m][n] = input.nextInt();
            }
        }

        System.out.println("Addition of A[][] and B[][] : ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }
        
        for (int a = 0; a < r; a++) {
            for (int b = 0; b < c; b++) {
                for (int d = 0; d < r; d++) {
                    M[a][b] += A[a][d] * B[d][b];
                }
            }
        }
        System.out.println("Multiplication of A[][] and B[][] : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }



}

}
