import java.util.Scanner;

public class ClassO
{
    public static void main(String [] args)
    {
        int numbers=0, even=0, odd=0;
        Scanner input = new Scanner(System.in);

        while(numbers!=999)
        {
            numbers++;
            System.out.println("Enter a number:");
            numbers = input.nextInt();
            if(numbers%2==0)
            {
                even++;
            } else
                odd++;

        }
        System.out.println(even);
        System.out.println(odd);
    }
}
