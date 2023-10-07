import java.util.Scanner;

public class ClassN
{
    public static void main(String [] args)
    {
        int count=0, numbers;
        Scanner input = new Scanner(System.in);


        while(count<5)
        {
            System.out.println("Enter five numbers: ");
            numbers = input.nextInt();
            count++;

            if(numbers%2==0 || numbers%3==0)
            {

            }
            else {
                System.out.println("it is an zero: " + numbers);
            }
            System.out.println("numbers of even: "+numbers);
            System.out.println("numbers of odd: "+numbers);
        }
    }
}
