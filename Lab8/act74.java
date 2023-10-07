package Lab8;

import java.util.Scanner;

public class act74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to choose menu:");
        System.out.println("1: For input and display the array \n " +
                "2: For searching element in an array \n " +
                "3: For largest and smallest element in the Array \n 4: For copy data to another Array");
        int a = input.nextInt();
        switch (a){
            case 1:
                int [] a1 = new int[1];
                int[] array = (input(a1));
                display(array);
                break;
            case 2:
                a1 = new int[1];
                int [] array1 = (input(a1));
                System.out.println("Enter the number of search");
                int searchkey = input.nextInt();
                search(array1, searchkey);
                break;
            case 3:
                a1 = new int[1];
                int[] array11 = (input(a1));
                largest(array11);
                smallest(array11);
                break;
            case 4:
                a1 = new int[1];
                array1 = (input(a1));
                int [] copied = new int[10];
                copyData(array1, copied);
                break;
            default:
                System.out.println("Number Enter Is Invalid.");
        }

    }

    public static int[] input(int[] Array) {
        int [] array1 = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<10; i++){
            System.out.println("A["+i+"] = ");
            array1[i] = input.nextInt();
        }
        return array1;

    }

    public static void display(int [] A) {
        for (int j = 0; j<10; j++){
            System.out.println("A[" +j+ "]" + A[j]);
        }
    }

    public static void search(int [] array, int x) {
        int flag = 0;
        while (flag == 0){
            for (int j = 0; j<10; j++){
                if (array[j]==x){
                    System.out.println("Element Found A[" +j+ "] " + array[j]);
                    flag++;
                }
            }
            if (flag == 0){
                System.out.println("Element is not found");
                break;
            }
        }

    }

    public static void largest(int[] array) {
        int k = array[0];
        for (int i = 0; i < 10; i++){
            if (array[i] >= k){
                k = array[i];
            }
        }
        System.out.println("largest value at A[0] " + k);

    }

    public static void smallest(int [] array) {
        int k = array[9];
        for (int i = 0; i<10; i++){
            if (k>= array[i]){
                k = array[i];
            }
        }
        System.out.println("The Smallest value at A[9] " + k);
    }

    public static void copyData(int[] array, int[] copied) {
        System.arraycopy(array, 0, copied, 0, 10);
        for (int k=0; k<10; k++){
            System.out.println("New Copied array is B[" + k + "]" + copied[k]);
        }

    }
}
