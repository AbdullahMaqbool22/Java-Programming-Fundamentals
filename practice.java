public class practice
{
    public static void main(String[] args) {
        printTwinPrimes(100);

        }

    public static boolean isPrime(int number) {
        if (number<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(number); i++){
            if (number % i ==  0){
                return false;
            }
        }
        return true;

    }

    public static void printTwinPrimes(int limit)
    {
        for (int i = 3; i <= limit; i++){
            if (isPrime(i) && (isPrime(i + 2) || isPrime(i-2)))
            {
                System.out.println(" ( " + i + " , " + (i + 2) + " )");
            }
        }

    }

}

