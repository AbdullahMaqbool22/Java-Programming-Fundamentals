import java.util.Scanner;

public class LActivity43
{
    public static void main(String [] args)
    {
        int n, hours, minutes;
        System.out.println("Enter the minutes: ");
        Scanner console = new Scanner(System.in);
        n = console.nextInt();
        hours = n/60;
        minutes = n%60;
        System.out.println("The time is "+ hours + ":" + minutes);

    }
}
