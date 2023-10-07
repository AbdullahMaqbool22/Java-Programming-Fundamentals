import java.util.Scanner;

public class Activity56
{
    public static void main(String [] args)
    {
        Scanner console = new Scanner(System.in);
        int num,max;
        num=console.nextInt();
        max=num;
        do{
            num=console.nextInt();
            if (num>max)
            {
                max=num;
            }
        }while(num!=0);
        System.out.println("MAx is :"+max+"number is :"+num);
    }
}
