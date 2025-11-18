public class Task4 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i <= 90; i++) {
            double sinValue = Math.sin(Math.toRadians(i));

            System.out.printf("sin(%d) = %.4f   ", i, sinValue);
            count++;

            if (count == 5) {
                System.out.println();
                count = 0;
            }
        }
    }
}
