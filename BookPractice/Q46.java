public class Q46 {
    public static void main(String[] args) {
        int i, count = 0;
        for (i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count += 1;
            }
            if (count == 10) {
                System.out.println(" ");
                count = 0;
            }
        }
    }
}
