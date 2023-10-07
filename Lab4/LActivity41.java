public class LActivity41
{
    public static void main(String [] args)
    {
        int x = 10, y= 15, z=20;
        boolean exp1  = !(x > 10);
        System.out.println(exp1);
        boolean exp2 = x<=5 || y<15;
        System.out.println(exp2);
        boolean exp3 = (x!=5)&&(y!=z);
        System.out.println(exp3);
        boolean exp4 = x>=z || (x+y>=z);
        System.out.println(exp4);
        boolean exp5 = (x <= y - 2) && ( y >= z) || (z-2 != 20);
        System.out.println(exp5);





    }
}

