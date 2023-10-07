import java.util.Scanner;
public class LActivity52
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
                int num, fact = 1;
                System.out.print("Enter a number : ");
                num = scanner.nextInt();
                while (num != 1) {
                    fact *= num;
                    num--;
                }
                System.out.println("Factorial is : " + fact);
            }

}
