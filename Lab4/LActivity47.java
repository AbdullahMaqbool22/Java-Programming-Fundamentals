import java.util.Scanner;

public class LActivity47
{
    public static void main(String [] args)
    {
        int length1, width1, length2, width2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter l1: ");
        length1 = input.nextInt();
        System.out.println("Enter w1: ");
        width1 = input.nextInt();
        System.out.println("Enter l2: ");
        length2 = input.nextInt();
        System.out.println("Enter w2: ");
        width2 = input.nextInt();
        int a1 = length1 * width1;
        int a2 = length2 * width2;
        if (a1>a2)
            System.out.println("A1 is greater");
        else if (a1<a2) {
            System.out.println("A2 is greater");

        }
        else
            System.out.println("both are same");

    }
}
