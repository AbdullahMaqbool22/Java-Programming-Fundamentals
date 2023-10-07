package ClassAssignment3;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array1 = new int[3][3];
        int [][] array2 = new int[3][3];
        int [][] array3 = new int[3][3];
        System.out.println("Enter the numbers for matrix1: ");
        for (int i = 0; i< array1.length; i++){
            for (int j = 0; j< array1.length; j++){
                array1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the numbers for matrix2: ");
        for (int i = 0; i< array2.length; i++){
            for (int j = 0; j< array2.length; j++){
                array2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                array3[i][j]= array1[i][j]*array2[i][j];
            }
        }
        System.out.println("The multiplied arrays are:");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

