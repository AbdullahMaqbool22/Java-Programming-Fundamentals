import java.util.Scanner;
public class LA25
{
    public static void main(String [] args)
    {
        int num1 = 0, num2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = input.nextInt();
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < n; i++) {
            int newnum = num1 + num2;
            System.out.print(" " + newnum);
            num1 = num2;
            num2 = newnum;
        }
    }
}



