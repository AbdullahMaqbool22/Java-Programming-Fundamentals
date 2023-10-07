public class LActivity103 {

        public static void main(String[] args) {
            int degrees = 30;
            double radians = Math.toRadians(degrees);
            double sin = Math.sin(radians);
            double cos = Math.cos(radians);
            double tan = Math.tan(radians);

            System.out.printf("Degrees\t Radians\tSins\t\t Cosine\t\t Tangent\n");
            // System.out.printf("");
            System.out.printf("%2d\t %2.4f\t\t %2.4f\t\t %2.4f\t\t %2.4f", degrees, radians,sin,cos,tan);

            degrees = 60;
            radians = Math.toRadians(degrees);
            sin = Math.sin(radians);
            cos = Math.cos(radians);
            tan = Math.tan(radians);
            System.out.printf("\n%2d\t %2.4f\t\t %2.4f\t\t %2.4f\t\t %2.4f", degrees, radians,sin,cos,tan);


    }
}


