public class ClassY
{
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static int reverse(int a) {
        int reverse = 0, reminder;
        while(a>0){
            reminder = a%10;
            a = a/10;
            reverse = reverse * 10 + reminder;
        }
        return reverse;
    }

    public static boolean isPalindrome(int a) {
        return a == reverse(a);
    }
}
