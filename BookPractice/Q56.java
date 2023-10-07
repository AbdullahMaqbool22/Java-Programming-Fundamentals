public class Q56
{
    public static void main(String [] args)
    {
        int n=1,number;
        for(n=100;n<=150;n++)
        {
            number=(n*n);
            if(number>12000)
            {
                System.out.print("The answer is :"+n);
                n=200;
            }
        }
    }
}
