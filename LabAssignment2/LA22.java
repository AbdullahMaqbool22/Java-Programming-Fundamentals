import java.util.Scanner;

public class LA22
{
    public static void main(String [] args)
    {
        int num1, n, rev = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digit printer: ");
        num1 = input.nextInt();
        while(num1>0)
        {
            n = num1%10;
            rev = rev*10 + n;
            num1 = num1/10;

        }
        System.out.println(rev);
    }
}

