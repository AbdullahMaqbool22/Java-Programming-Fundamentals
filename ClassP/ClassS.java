import java.util.Scanner;

public class ClassS
{
    public static void main(String [] args)
    {
        int N, num1=0, pNum = 1, res=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The limit of number you want: ");
        N = input.nextInt();
        while(res != N)
        {
           res = num1 + pNum;
           pNum = num1;
           num1 = res;
           System.out.println(res);
        }

    }
}
