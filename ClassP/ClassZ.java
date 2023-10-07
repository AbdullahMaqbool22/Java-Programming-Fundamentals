public class ClassZ {
    public static void main(String[] args) {
        int larger = max(3, 4);
        double U_larger = max(3.0, 5.4);
        double UU_larger = max(3.0, 5.4, 10.14);
        System.out.println(larger);
        System.out.println(U_larger);
        System.out.println(UU_larger);
    }

    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double max(double num1, double num2, double num3) {
            return max(max(num1, num2), num3);
    }


}
