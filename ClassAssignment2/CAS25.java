import java.util.Scanner;
public class CAS25
{
    public static void main(String[] args)
    {
        int c_opt1 = 2, c_opt2 = 1, c_opt3 = 4, c_opt4 = 4, c_opt5 = 4;
        Scanner input = new Scanner(System.in);
        System.out.println("A.\tWhat is the main argument of global warming skeptics?");
        System.out.println("1. The Earth is not warming. ");
        System.out.println("2. The Earth is warming, but it's not caused by human activities. ");
        System.out.println("3. The Earth is warming, but it's not a problem.");
        System.out.println("4. None of the above.");
        System.out.println("Enter the correct choice");
        int opt1 = input.nextInt();
        System.out.println("B.\tWhich of the following statements is a common argument of global warming skeptics?");
        System.out.println("1. The Earth's temperature has always fluctuated throughout history.");
        System.out.println("2. The scientific consensus on global warming is overwhelming.");
        System.out.println("3. Reducing carbon emissions is not necessary to combat global warming.");
        System.out.println("4. None of the above.");
        int opt2 = input.nextInt();
        System.out.println("C.\tHow do global warming skeptics often argue against the use of climate models?");
        System.out.println("1. By stating that climate models are inaccurate.");
        System.out.println("2. By arguing that climate models do not account for natural climate variability.");
        System.out.println("3. By claiming that climate models are biased towards showing warming.");
        System.out.println("4. All of the above.");
        int opt3 = input.nextInt();
        System.out.println("D.\tWhat is a common tactic used by global warming skeptics to discredit climate scientists?");
        System.out.println("1. Attacking the personal integrity of climate scientists.");
        System.out.println("2. Dismissing the scientific consensus on global warming.");
        System.out.println("3. Using misleading or cherry-picked data to support their arguments.");
        System.out.println("4. All of the above.");
        int opt4 = input.nextInt();
        System.out.println("E.\tWhich of the following is not a consequence of global warming according to the scientific consensus?");
        System.out.println("1. Rising sea levels.");
        System.out.println("2. Increased frequency and intensity of heatwaves.");
        System.out.println("3. Ocean acidification.");
        System.out.println("4. Decreased atmospheric carbon dioxide concentrations.");
        int opt5 = input.nextInt();
        if ((opt1 == c_opt1) && (opt2 == c_opt2) && (opt3 == c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Excellent");
        }
        else if ((opt1 != c_opt1) && (opt2 == c_opt2) && (opt3 == c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Very Good");
        }
        else if ((opt1 == c_opt1) && (opt2 != c_opt2) && (opt3 == c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Very Good");
        }
        else if ((opt1 == c_opt1) && (opt2 == c_opt2) && (opt3 != c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Very Good");
        }
        else if ((opt1 == c_opt1) && (opt2 == c_opt2) && (opt3 == c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Very Good");
        }
        else if (opt1 == c_opt1 && opt2 == c_opt2 && opt3 == c_opt3 && opt4 == c_opt4) {
            System.out.println("Very good");

        }
        else if ((opt1 != c_opt1) && (opt2 != c_opt2) && (opt3 == c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 != c_opt1) && (opt2 == c_opt2) && (opt3 != c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 != c_opt1) && (opt2 == c_opt2) && (opt3 == c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if (opt1 != c_opt1 && opt2 == c_opt2 && opt3 == c_opt3 && opt4 == c_opt4) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 == c_opt1) && (opt2 != c_opt2) && (opt3 != c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 == c_opt1) && (opt2 != c_opt2) && (opt3 == c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if (opt1 != c_opt1 && opt2 != c_opt2 && opt3 == c_opt3 && opt4 == c_opt4) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 == c_opt1) && (opt2 == c_opt2) && (opt3 != c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if (opt1 == c_opt1 && opt2 == c_opt2 && opt3 != c_opt3 && opt4 == c_opt4) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if (opt1 == c_opt1 && opt2 == c_opt2 && opt3 == c_opt3) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 != c_opt1) && (opt2 != c_opt2) && (opt3 != c_opt3) && (opt4 == c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 == c_opt1) && (opt2 != c_opt2) && (opt3 != c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }
        else if (opt1 == c_opt1 && opt2 == c_opt2) {
            System.out.println("Time to brush up on your knowledge of global warming.");
        }
        else if ((opt1 != c_opt1) && (opt2 != c_opt2) && (opt3 != c_opt3) && (opt4 != c_opt4) && (opt5 == c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }
        else if (opt1 != c_opt1 && opt2 != c_opt2 && opt3 != c_opt3 && opt4 == c_opt4) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }
        else if (opt1 != c_opt1 && opt2 != c_opt2 && opt3 == c_opt3 && opt5 != c_opt5) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }
        else if ((opt1 != c_opt1) && (opt2 == c_opt2) && (opt3 != c_opt3) && (opt4 != c_opt4) && (opt5 != c_opt5)) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }
        else if (opt1 == c_opt1 && opt3 != c_opt3 && opt4 != c_opt4) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        } else if (opt1 != c_opt1 && opt2 != c_opt2 && opt3 != c_opt3) {
            System.out.println("Time to brush up on your knowledge of global warming.");

        }

    }
}
