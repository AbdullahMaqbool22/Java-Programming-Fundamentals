package PracticeQuestions;

import java.util.Scanner;

public class pactik
{
    public static void main(String[] args) {
        //pattern 1.
        for (int i = 1; i<=4; i++){
            for (int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 2.
        for (int i =0; i<=5; i++){
            for (int j = 0; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 3.
        for (int i =0; i<=4; i++){
            for (int j = 4; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //pattern 4.
        for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print( j );
            }
            System.out.println();
        }
        System.out.println();
Scanner input = new Scanner(System.in);



    }
}
