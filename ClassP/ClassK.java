import java.util.Scanner;

public class ClassK
{
    public static void main(String [] args)
    {
        int start = 0, count;
        Scanner input = new Scanner(System.in);

        while(start<=10){
            System.out.println("Enter value");
            count= input.nextInt();
            start = start + count;
            count++;
        }
        int average = start/10;
        System.out.println(average);


    }
}
