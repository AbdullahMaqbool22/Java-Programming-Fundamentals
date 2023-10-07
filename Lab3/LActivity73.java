import java.util.Scanner;

public class LActivity73
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of the ticket sold for the class A: ");
        int classA = input.nextInt();
        int val1 = classA*20;
        System.out.println("The total amount of class A profit: " + val1);
        System.out.println("Enter the amount of the ticket sold for the class B: ");
        int classB = input.nextInt();
        int val2 = classB*15;
        System.out.println("The total amount of class B profit: " + val2);
        System.out.println("Enter the amount of the ticket sold for the class C: ");
        int classC = input.nextInt();
        int val3 = classC*10;
        System.out.println("The total amount of class C profit: " + val3);
        System.out.println("Enter the amount of the ticket sold for the class D: ");
        int classD = input.nextInt();
        int val4 = classD*5;
        System.out.println("The total amount of class D profit: " + val4);
    }
}

