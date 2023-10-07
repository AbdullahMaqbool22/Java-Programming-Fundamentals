package Lab10;

public class lact102 {
    public static void main(String[] args) {
        int[][] prime = {{5, 9, 3, 6}, {7, 2, 5, 8}, {12, 14, 15, 11}};
        int maxcount = 0;
        int maxindex = -1;
        int dow = 0;
        int cow = 0;

        int rows = prime.length;
        int cols = prime[0].length;
        int number;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number = prime[i][j];
                if (isPrime(number)) {
                    dow++;
                    cow++;
                }

            }
            if (dow > maxcount) {
                maxcount = dow;
                maxindex = i + 1;
            }

        }
        if (maxindex != -1) {
            System.out.println(cow);
            System.out.println(maxindex);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
