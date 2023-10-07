import java.util.Scanner;

public class ClassV
{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int percentage = input.nextInt();
        result(percentage);
    }
    public static void result(int percentage){
        switch (percentage){
            case 90:
                System.out.println("Your grade is A");
                break;
            case 80:
                System.out.println("Your grade is B");
                break;
            case 70:
                System.out.println("Your grade is C");
                break;
            case 60:
                System.out.println("Your grade is D");
            default:
                System.out.println("You are Fail. Emotional Damage!");
        }







    }
}
