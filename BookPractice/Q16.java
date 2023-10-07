import java.util.Scanner;

public class Q16
{
    public static void main(String [] args){
        int MHeight, FHeight, CHeight, MCHeight, FCHeight, wish, GChild;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Enter the child's gender 0 for Male and 1 for female: ");
            GChild = input.nextInt();
            System.out.println("Enter the Mother height:");
            MHeight = input.nextInt();
            System.out.println("Enter the Father height:");
            FHeight = input.nextInt();
            if(GChild == 0){
                MCHeight = ((MHeight*13/12)+FHeight)/2;
                System.out.println("The male child is height is: " + MCHeight);
            } else if (GChild == 1) {
                FCHeight = ((FHeight * 12/13)+MHeight)/2;
                System.out.println("The male child is height is: " + FCHeight);
            }
            System.out.println("Do you wish to continue again enter 1 or cancel at 0:");
            wish = input.nextInt();

        }while(wish==1);



    }
}
