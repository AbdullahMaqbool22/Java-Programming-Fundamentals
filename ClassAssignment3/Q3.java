package ClassAssignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters: ");
        String[] my_Array = new String[5];
        for (int i = 0; i < my_Array.length; i++) {
            my_Array[i] = input.next();
        }
        Arrays.sort(my_Array);
        System.out.println("The arranged characters are:");
        for (int i = 0; i< my_Array.length; i++){
            System.out.println(my_Array[i]+" ");
        }
    }
}



