public class Midterm22
{
    public static void main(String[] args) {
        System.out.println(isPerfect(6));

    }

    public static int isPerfect(int number) {
        int count = 0;
        for (int i = 1; i < number; i++){
            if (number%i==0){
                count += i;
            }
        }
        return count;
    }

}
