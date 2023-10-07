public class Midterm2
{
    public static void main(String[] args) {
        System.out.println(isPerfect(5));
    }
    public static boolean isPerfect(int number) {
        int count = 0;
        for(int i = 1; i < number; i++){
            int sum =+ i;
            if(sum == number) {
                return true;
            }
        }

        return false;
    }
}

