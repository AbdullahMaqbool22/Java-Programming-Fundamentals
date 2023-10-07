import java.util.Scanner;

public class ClassP
{
    public static void main(String [] args)
    {
        int num1, num2, number=0;
        Scanner input = new Scanner(System.in);
        num1 = (int)(Math.random()*100);
        System.out.println(num1);
        num2 = (int)(Math.random()*100);
        System.out.println(num2);
        while(number!=num1+num2){
            System.out.println("Enter the sum of number: ");
            number = input.nextInt();
            if(number == num1 + num2)
            {
                System.out.println("Congrats");
            }
            else
                System.out.println("Again");

        }
    }
}
