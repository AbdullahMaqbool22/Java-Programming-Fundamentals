import java.util.Scanner;

public class ClassF
{
    public static void main(String [] args)
    {
        double hours, wagePh, pay;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of hours:");
        hours = input.nextDouble();
        System.out.println("Enter the wage offered: ");
        wagePh = input.nextDouble();
        pay = hours * wagePh;
        if(hours>30)
        {
            pay = pay + pay*0.1;
            System.out.println("the pay is increased by 10" + pay);
        }
        else {
            System.out.println("Not eligenble for 10 increase");
        }
        if(hours>40)
        {
            pay = pay + pay*0.2;
            System.out.println("the pay is increased by 20 " + pay);
        }
        else {
            System.out.println("Not Eligeble");
        }
        if(hours>50)
        {
            pay = pay + pay * 0.3;
            System.out.println("The pay is increased by 30" + pay);

        }
        else
        {
            System.out.println("not");
        }
    }

}
