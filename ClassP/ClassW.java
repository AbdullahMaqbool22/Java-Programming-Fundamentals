import java.util.Scanner;

public class ClassW
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter val1:");
        int a = input.nextInt();
        System.out.println("Enter val2");
        int b = input.nextInt();
        swap(a, b);

    }
    public static void swap(int a, int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a +" The swapped value is "+ b);
    }
}
