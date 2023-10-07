package Lab10;

import java.util.Scanner;

public class lact103
{
    public static void main(String[] args) {
                int[][] matrix1 = new int[3][4];
                int[][] matrix2 = new int[4][3];
                int[][] result = new int[3][3];

                Scanner scanner = new Scanner(System.in);

                // Accepting the first matrix from the user
                System.out.println("Enter the elements of the first matrix (3x4):");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        matrix1[i][j] = scanner.nextInt();
                    }
                }

                // Accepting the second matrix from the user
                System.out.println("Enter the elements of the second matrix (4x3):");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrix2[i][j] = scanner.nextInt();
                    }
                }

                // Matrix multiplication
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 4; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }

                // Displaying the result
                System.out.println("Matrix multiplication result:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }

                scanner.close();
    }
}



