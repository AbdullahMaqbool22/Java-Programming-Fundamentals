import java.util.Scanner;

public class LActivity55 {
    static  Scanner input = new Scanner(System.in);
    public static void main(String [] args)
    {
        int max = 0, num = -1;
        Scanner input = new Scanner(System.in);
        while (num != 0) {
            System.out.print("Enter the number : ");
            num = input.nextInt();
            if (num > max){
                max = num;
            }
        }
        System.out.println("Maximum of numbers are : " + max);
    }
}
