import java.util.Scanner;

public class G7
{
    public static void main(String [] args)
{
    int min, years, days, minInYear;
    Scanner input = new Scanner(System.in);
    minInYear = 60 * 24 * 365;

    System.out.println("Enter the number of minutes: ");
    min = input.nextInt();
    years = min / minInYear;
    days = (min/60/24) % 365;
    System.out.println(min + "minutes is approximately " +years+ " years and " +days+ " days");


}

}
