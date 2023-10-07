import java.util.Scanner;

public class LA31
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = input.nextInt();
        int greater = 0;
        int total = 0;
        int greaterNum = 0;
        while (num != 0) {
            System.out.println("Enter a number : ");
            num = input.nextInt();
            if (num > greater) {
                greater = num;
                greaterNum = total;
            }
            total++;
        }
        System.out.println("The numbers greater than others are : " +total);
    }
}
