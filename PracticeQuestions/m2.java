public class m2
{
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'Z';
        int charactersPerLine = 10;
        print(ch1, ch2, charactersPerLine);
    }
    public static void print(char ch1, char ch2, int numberPerLine) {
        int count = 0;
        char ch;
        for ( ch = (char) (ch1 + 1); ch < ch2; ch++) {
            System.out.print(ch);
            count++;

            if (count % numberPerLine== 0) {
                System.out.println();
            }

        }

    }


}

