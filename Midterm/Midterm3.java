public class Midterm3
{
    public static void main(String[] args) {
        System.out.println(power(2)-1);
    }

    public static double power(double number) {
        double pow = 0;
        for (int i = 1; i <= number; i++) {
            pow = Math.pow(number, number);
            pow += number;
        }
        return pow;
    }
}

