import java.util.Scanner;

public class ClassM
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        while(userNumber>=0){
            System.out.println("Guess My Number : ");
            userNumber = input.nextInt();
            if (userNumber == myNumber)
            {
                System.out.println("WOOHO.....CORRECT NUMBER!");
                break;
            }
            else if (userNumber > myNumber)
            {
                System.out.println("Number too Large");
            }
            else
            {
                System.out.println("Your number too small");
            }


        }
        System.out.println("My Number Was : ");
        System.out.println(myNumber);

    }
}








