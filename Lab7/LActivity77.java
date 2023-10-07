package Lab7;

import java.util.Scanner;
public class LActivity77
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = console.nextInt();
        printMatrix(n);
    }
        public static void printMatrix(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print((int)(Math.random() * 2));
                }
                System.out.println(" ");
            }
        }
}
