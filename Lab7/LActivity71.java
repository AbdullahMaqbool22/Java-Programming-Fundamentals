
public class LActivity71
{
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
        System.out.println(reverse(1234));
        System.out.println(isPalindrome(101));
    }
    public static int sumDigits(long n) {
        int sum =0;
        while(n>0) {
            sum+=n%10;
            n/=10;
        }
            return sum;
    }
    public static int reverse(int number)
    {
        int rem;
        int rev = 0;
        while(number>0){
            rem  = number % 10;
            rev = rev * 10 + rem;
            number = number/10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number){
        if(reverse(101)==number)
            return true;
        else
            return false;
    }
}
