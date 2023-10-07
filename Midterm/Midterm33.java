public class Midterm33
{
    public static void main(String[] args) {
        System.out.println(formula(2));

    }
    public static int formula(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++){
            count += Math.pow(i, i);
        }
        return count;

    }


}
