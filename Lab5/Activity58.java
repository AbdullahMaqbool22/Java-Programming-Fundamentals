import java.util.Scanner;

public class Activity58
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int sum=0,number=0;
        while(number<20)
        {
            sum+=number;
            if (sum>=100)
            {
                break;
            }
        }
        System.out.println("The number  is :"+number);
        System.out.println("The sum  is :"+sum);
    }
}
