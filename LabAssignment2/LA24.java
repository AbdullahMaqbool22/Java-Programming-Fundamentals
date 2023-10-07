public class LA24 {
    public static void main(String[] args) {
        for (int num = 1; num <= 500; num++) {
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if (num == sum) {
                System.out.println(num);
            }

        }
    }
}
