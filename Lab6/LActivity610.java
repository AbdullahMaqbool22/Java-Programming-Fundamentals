public class LActivity610
{
    public static void main(String[] args) {
        String str = "Hello World!";
        // Third letter
        System.out.println(str.charAt(2));
        // Second last letter
        System.out.println(str.charAt(str.length() - 2));
        // First letter
        System.out.println(str.substring(0, 5));
        //  All but the last two characters of this string
        System.out.println(str.substring(0, str.length() - 2));
        // all the characters of this string with even indices
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // all the characters of this string with odd indices
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // every second character of the string in reverse order, starting from the last one
        for (int i = str.length() - 1; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        // Length of the string
        System.out.println(str.length());
    }
}
