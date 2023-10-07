import java.util.Scanner;

public class ClassL
{
    public static void main(String [] args)
    {
        int num=0, sum = 0, count = 0;
        Scanner input =new Scanner(System.in);
        System.out.println("number");
        num = input.nextInt();
        while(count<=10)
        {
            System.out.println(num*count);
            count++;
            sum++;
        }

    }
}
