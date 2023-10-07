import java.util.Scanner;
public class ClassA2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want perform addition, subtraction or multiplication enter 0, 1, 2 respectively for required: ");
        int wish = input.nextInt();
        if (wish == 0)
        {
            System.out.println("Is your input in integer or double? Enter 0 or 1 respectively:");
            int wish_t = input.nextInt();
            if (wish_t == 0) {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0) {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    int val2 = input.nextInt();
                    int result = calc(val1, val2);
                    System.out.println("Your result is: " + result);
                }
                else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    int val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    int val3 = input.nextInt();
                    int result = calc(val1, val2, val3);
                    System.out.println("Your result is: " + result );
                }
            }
            else if (wish_t == 1) {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0) {
                    System.out.println("Enter your first value");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value");
                    double val2 = input.nextInt();
                    double result = calc(val1, val2);
                    System.out.println("Your result is: " + result);
                }
                else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    double val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    double val3 = input.nextInt();
                    double result = calc(val1, val2, val3);
                    System.out.println("Your result is: " + result);
                }
                else
                    System.out.println("Invalid Input. Thanks!");
            }
        }
        else if (wish == 1)
        {
            System.out.println("Is your input in integer or double? Enter 0 or 1 respectively:");
            int wish_t = input.nextInt();
            if (wish_t == 0)
            {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0)
                {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value");
                    int val2 = input.nextInt();
                    int result = calc_s(val1, val2);
                    System.out.println("Your result is: " + result);

                }
                else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    int val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    int val3 = input.nextInt();
                    int result = calc_s(val1, val2, val3);
                    System.out.println("Your result is: " + result );
                }
            }
            else if (wish_t == 1)
            {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0) {
                    System.out.println("Enter your first value:");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    double val2 = input.nextInt();
                    double result = calc_s(val1, val2);
                    System.out.println("Your result is: " + result);
                }
                else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    double val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    double val3 = input.nextInt();
                    double result = calc_s(val1, val2, val3);
                    System.out.println("Your result is: " + result);

                }
                else
                    System.out.println("Invalid Input. Thanks!");
            }

        }
        else if (wish == 2)
        {
            System.out.println("Is your input in integer or double? Enter 0 or 1 respectively:");
            int wish_t = input.nextInt();
            if (wish_t == 0) {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0) {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    int val2 = input.nextInt();
                    int result = calc_p(val1, val2);
                    System.out.println("Your result is: " + result);

                } else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    int val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    int val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    int val3 = input.nextInt();
                    int result = calc_p(val1, val2, val3);
                    System.out.println("Your result is: " + result );

                }
                else
                    System.out.println("Invalid Input. Thanks!");
            }
            else if (wish_t == 1) {
                System.out.println("Do you want to calculate for 2 or 3 variables? Enter 0 or 1 respectively :");
                int wish_v = input.nextInt();
                if (wish_v == 0) {
                    System.out.println("Enter your first value:");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    double val2 = input.nextInt();
                    double result = calc_p(val1, val2);
                    System.out.println("Your result is: " + result);


                }
                else if (wish_v == 1) {
                    System.out.println("Enter your first value:");
                    double val1 = input.nextInt();
                    System.out.println("Enter your second value:");
                    double val2 = input.nextInt();
                    System.out.println("Enter your third value:");
                    double val3 = input.nextInt();
                    double result = calc_p(val1, val2, val3);
                    System.out.println("Your result is: " + result);

                }
                else
                    System.out.println("Invalid Input. Thanks!");
            }
            else
                System.out.println("Invalid Input. Thanks!");

        }

    }
    public static int calc(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }
   public static int calc_s(int num1, int num2)
    {
        int sub = num1 - num2;
        return sub;
    }
    public static int calc_p(int num1, int num2)
    {
       int prod = num1 * num2;
        return prod;
    }
    public static double calc(double num1, double num2)
    {
        double sum = num1 + num2;
        return sum;
    }
    public static double calc_s(double num1, double num2)
    {
        double sub = num1 - num2;
        return sub;
    }
    public static double calc_p(double num1, double num2)
    {
        double prod = num1 * num2;
        return prod;
    }

    public static int calc(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }
    public static int calc_s(int num1, int num2, int num3)
    {
        int sub = num1 - num2 - num3;
        return sub;
    }
    public static int calc_p(int num1, int num2, int num3)
    {
        int prod = num1 * num2 * num3;
        return prod;
    }
    public static double calc(double num1, double num2, double num3)
    {
        double sum = num1 + num2 + num3;
        return sum;
    }
    public static double calc_s(double num1, double num2, double num3)
    {
    double sub  = num1 - num2 - num3;
    return sub;
    }
    public static double calc_p(double num1, double num2, double num3)
    {
        double prod = num1 * num2 * num3;
        return prod;
    }
}