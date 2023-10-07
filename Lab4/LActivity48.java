import java.util.Scanner;

public class LActivity48
{
    public static void main(String [] args)
    {
        int month, day,year;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month");
        month = input.nextInt();
        System.out.println("Enter the day");
        day = input.nextInt();
        System.out.println("Enter the year");
        year= input.nextInt();
        if(month * day == year)
            System.out.println("Mogic");
        else
            System.out.println("Na Na");
    }
}
