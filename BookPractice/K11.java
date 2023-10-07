import java.util.Scanner;

public class K11
{
    public static  void main(String [] args)
    {
        int years, population, cp, birth, death;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of year:");
        years = input.nextInt();
        System.out.println("Enter the current population: ");
        cp = input.nextInt();
        double annualBR = (60 * 60 * 24 * 365 )/ 7.0;
        double annualDR = (60 * 60 * 24 * 365) /13.0;
        double annualIR = (60 * 60 * 24 * 365) / 45.0;
        double newPop = cp + ((annualBR + annualIR - annualDR) * years);
        System.out.println("THe population in years " +  (int)newPop);






    }



}
/*(Population projection) The U.S. Census Bureau projects population based on the
        following assumptions:
        ■ One birth every 7 seconds
        ■ One death every 13 seconds
        ■ One new immigrant every 45 seconds*/