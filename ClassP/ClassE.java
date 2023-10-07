import java.util.Scanner;

public class ClassE
{
    public static void main(String [] args)
    {
        double  earn, employed;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your earning:");
        earn = input.nextDouble();
        System.out.println("Enter the years you were employeed: ");
        employed = input.nextDouble();
        if (earn>=30000)
        {
            System.out.println("You are gone successful at stage 1");
            if (employed>=2)
            {
                System.out.println("You are gone eligeble for the loan");
            }
            else
            {
                System.out.println("YOu are not eligeble on experince basis");
            }
        }
        else {
            System.out.println("Not eligeble on salary basis");
        }


    }
}
