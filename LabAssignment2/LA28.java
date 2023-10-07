import java.util.Scanner;

public class LA28
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a Number : ");
        int num = input.nextInt();
        while (num != 0) {
            System.out.println("Enter a number : ");
            num = input.nextInt();
            count += 1;
        }
        System.out.println("The length of Sequence is : " +count);
    }
}
