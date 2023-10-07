package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lact2 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            int[] inp = new int[10];
            int index = 0;

            System.out.println("Input 10 Integers: ");
            for (int i = 0; i < inp.length; i++) {
                while (true) {
                    try {
                        inp[i] = console.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("You have entered an invalid input, type integers only.");
                        console.next();
                    }
                }
            }

            try {
                System.out.println("Input index which you want to dispay(1-10): ");
                index = console.nextInt();
                System.out.println("Value at given index: " + inp[index - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is out of range");
            } catch (InputMismatchException e) {
                System.out.println("You have entered an invalid Int");
            }
        }
    }


