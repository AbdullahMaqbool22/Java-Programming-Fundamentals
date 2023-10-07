import java.util.Scanner;

public class prac
{
    public static void main(String[] args) {
        int [][] busA = new int[10][25];
        int bus=0, seat=0;
        int [][] busB = new int[1][1];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the seat you wanna book:");
        for (int i = 0; i<1; i++){
            for (int j = 0; j < 1; j++){
               busB [bus][seat]= input.nextInt();
            }
        }
        System.out.println("Enter the bus you wanna book in:");
        for (int i = 0; i<1; i++){
            for (int j = 0; j < 1; j++){
                busB [i][j]= input.nextInt();
            }
    }

        AddaSeat(busA, bus, seat);
        int busS = MaxFilled(busA);
        System.out.println("Max filled bus is" + busS);
    }


    public static void AddaSeat(int [][] busRecord, int bus, int seat) {
        for (int i = 0; i<bus; i++){
            for (int j = 0; j< seat; j++){
                if (busRecord[i][j]==bus && busRecord[i][j]==seat){
                    System.out.println("1");
                }
                else
                    System.out.println("0");
            }
        }

    }

    public static int MaxFilled(int [][] busRecord) {
        int sum = 0, max = 0;
        int i;
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 25; j++) {
                sum += busRecord[i][j];
                if (sum > busRecord[i][j]) {
                    busRecord[i][j] = sum;
                    i = max;
                    sum = 0;
                }
            }
        }
        return i;
    }
}
