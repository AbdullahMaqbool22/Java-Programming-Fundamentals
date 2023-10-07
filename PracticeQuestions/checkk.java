import java.util.Scanner;
public class checkk {
    public static void main(String[] args) {
        int busNo = 10;
        int seatsNo = 25;
        int [][] busRecord = new int[busNo][seatsNo];
        AddASeat(busRecord, seatsNo, busNo);
        int answer = max(busRecord);
        System.out.println("The bus with maximum seats is: " + answer);
    }
    public static void AddASeat(int [][] busRecord, int seatsNo, int busNo) {
        int bus;
        int seat;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the bus number and seat number: ");
        bus = input.nextInt();
        seat = input.nextInt();
        for (int i = 0; i < busNo; i++) {
            for (int j = 0; j < seatsNo; j++) {
                busRecord[i][j] = 0;
            }
        }
        for (int i = 0; i < busNo; i++) {
            for (int j = 0; j < seatsNo; j++) {
                busRecord[bus][seat] = 1;
            }
        }
    }
    public static int max(int[][] busRecord) {
        int seat = 0;
        int maxBus = 0;
        int busInd = 0;
        for (int i = 0; i < 10; i++ ) {
            for (int j = 0; j < 25; j++) {
                if (busRecord[i][j] == 1) {
                    seat++;
                }
            }
            if (seat > maxBus) {
                maxBus = seat;
                busInd = i;
                seat = 0;
            }
        }
        return busInd;
    }

}
