package ClassAssignment3;
import java.util.Arrays;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Enter function you want to perform:");
        System.out.println("1: Do you want to find a targeted number: ");
        System.out.println("2: Do you want to sort all the number through partition: ");
        System.out.println("3: Do you want to find a duplicate occurrences:");
        System.out.println("4: Do you want to circular it: ");
        System.out.println("5: Do you want to circular shift it: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the number you want to target: ");
                int target = input.nextInt();
                int div = count(array, target);
                System.out.println("The target number occurs about: " + div + " times.");
                break;
            case 2:
                System.out.println("The partition occurrence is:");
                int[] riv = partition(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(riv[i] + " ");
                }
                break;
            case 3:
                System.out.println("The duplicate occurrences element are: ");
                int kiv = duplicates(array);
                System.out.println(kiv);
                break;
            case 4:
                System.out.println("The circularly array is: ");
                int[] biv = circular(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.println(biv[i]);
                }
                break;
            case 5:
                System.out.println("he circularly shifted array is: ");
                int[] siv = shiftCircular(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.println(siv[i]);
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static int count(int [] array, int number) {
        int sum = 0;
        for (int i =0; i< array.length; i++){
            if (number == array[i]){
                sum++;
            }
        }
        return sum;
    }

    public static int [] partition(int [] array) {
        for (int i = 0; i< array.length; i++){
            Arrays.sort(array);
        }
        return array;
    }

    public static int duplicates(int [] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]== array[0]){
                sum++;
            }
        }
        return sum;
    }

    public static int [] circular(int [] array) {
        int size = array.length;
        int [] arrayN = new int[size];

        for (int i = 0; i< array.length; i++){
            int arr = (i+1)%size;
            int arr1 = (i+1)%size;

            arrayN[i] = array[arr]+ array[arr1];

        }
        return arrayN;
    }

    public static int[] shiftCircular(int[] array) {
        int size = array.length;
        int [] arrayN = new int[size];
        for (int i = 0; i<array.length; i++){
            int arr = (i+2)%size;
            arrayN[i]=array[arr];
        }
        return arrayN;
    }
}
