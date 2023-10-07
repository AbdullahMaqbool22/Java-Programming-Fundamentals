import java.util.Scanner;

public class lact71
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[40];
        int count = 0;
        do{
            System.out.println("How do you Rate the quality of food: ");
            array [0] = input.nextInt();
            System.out.println("How do you Rate the cleanliness of food: ");
            array [1]= input.nextInt();
            System.out.println("How do you Rate the Staff corporation: ");
            array [2] = input.nextInt();
            System.out.println("How do you Rate the Overall performance of the Cafe: ");
            array [3] = input.nextInt();
            count++;
        }while(count==40);

        if (pollbad(array)>pollgood(array)){
            System.out.println("Improvement will be done in the cafe.");
        } else if (pollgood(array)>pollbad(array)) {
            System.out.println("Good Service");

        }
        else
        System.out.println("Thanks for the service");


    }
    public static int pollbad(int [] array) {
        int count = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[0] == 1 || array[1] == 1 || array[2] == 1 || array[3] == 1) {
                count++;
            }
        }
        return count;
    }

    public static int pollgood(int [] array) {
        int countp = 0;
        for (int j = 0; j< array.length; j++){
            if (array[0]==10 || array[1]==10 || array[2]==10 || array[3]==10)
            {
                countp++;
            }
        }
        return countp;
    }
}
