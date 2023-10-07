public class Q76
{
    public static void main(String [] args){

                int count = 0;
                boolean prime = true;

                for (int i = 2; i <= 1000; i++) {
                    prime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            prime = false;
                            break;
                        }
                    }

                    if (prime) {
                        System.out.printf("%-5d", i);
                        count++;

                        if (count % 8 == 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }
