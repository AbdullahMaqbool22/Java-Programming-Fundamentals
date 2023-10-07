import java.util.Scanner;

public class ClassA3 {
    public static void main(String[] args) {
        int[] array_int = new int[5];
        char[] array_char = new char[5];

        double[] array_double = new double[5];
        array_double[0] = 1.0;
        array_double[1] = 2.0;
        array_double[2] = 3.0;
        array_double[3] = 4.0;
        array_double[4] = 5.0;

        for (int i = 0; i < 5; i++) {
            System.out.println(array_double[i]);
        }
        for (int i = 0; i < 5; i++) {
            array_int[i] = 10;
            System.out.println(array_int[i]);
        }
        array_int[0] = 56;
        array_int[1] = 77;
        array_int[2] = 3;
        array_int[3] = 4;
        array_int[4] = 5;
        System.out.println(array_int[0] * array_int[4]);
        System.out.println(array_int[1] + array_int[2]);

        int[] array2_int = {1, 4, 5, 7, 9};

        for (int i = 0; i < array2_int.length; i++) {
            System.out.println(array2_int[i]);
        }
        boolean[] array3 = new boolean[5];
        array3[0] = true;
        array3[1] = true;
        array3[2] = false;
        array3[3] = false;
        array3[4] = false;
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }


        int[] a = new int[7];
        a[0] = 9;
        a[6] = 8;
        a[3] = 6;
        System.out.println(mul(a, 7));


    }

    public static void workwithArrays() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = input.nextInt();
        int[] array_int = new int[size];
        for (int i = 0; i < array_int.length; i++) {
            System.out.println(array_int[i]);
        }
    }

    public static void user() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        int df = input.nextInt();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            System.out.println(array[i]);
        }

    }

    public static void rand() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random() * 101;
            System.out.println(array[i]);
        }


    }

    public static void sum() {
        int[] array = new int[5];
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the values:");
            array[i] = input.nextInt();


        }
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }


    }

    public static void greater() {
        System.out.println(largest());
    }

    public static int largest() {
        Scanner input = new Scanner(System.in);
        int largestindex = 0;
        int[] array = new int[5];
        int largest = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the value " + (i + 1) + ":");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                largestindex = i;
            }
        }
        return largestindex;

    }

    public static void printevenindexes() {
        {
            Scanner input = new Scanner(System.in);
            int index = 0;
            int[] array = new int[5];
            for (int i = 0; i < array.length; i++) {
                System.out.println("enter the number:");
                array[i] = input.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                index = i;
                if (array[i] % 2 == 0) {
                    System.out.println(index);
                }
            }
        }
    }

    public static void str() {
        Scanner input = new Scanner(System.in);

        String[] array_string = new String[5];
        for (int i = 0; i < array_string.length; i++) {
            System.out.println("Enter A String:");
            array_string[i] = input.next();
        }
        for (int i = 0; i < array_string.length; i++) {
            System.out.println(array_string[i]);
        }

    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;

    }

    public static int large(int[] array) {

        int largest = array[0];
        for (int i = 0; i < array.length; i++) {


        }
        return largest;
    }

    public static void multiplyArrayByTwo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        //System.out.println(Arrays.toString(arr));
    }

    public static void product(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] mul(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (a == array[i]) {
                System.out.println("True");
            } else
                System.out.println("False");
        }
        return array;
    }

}





















