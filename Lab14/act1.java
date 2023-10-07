package Lab14;

import java.util.Scanner;

public class act1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println(n+ " != " + factorial(n));
    }

    public static int factorial(int a) {
        int f = 1;
        for(int i = 1; i<=a; i++)
            f=f*i;
        return f;

    }
}
