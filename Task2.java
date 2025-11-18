import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть кількість кутів: ");
        int n = sc.nextInt();

        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введіть кути:");
        for (int i = 0; i < n; i++) {
            angles[i] = sc.nextInt();
            sum += angles[i];
        }

        int required = 180 * (n - 2);

        if (sum == required) {
            System.out.println("Такий багатокутник може існувати.");
        } else {
            System.out.println("Такий багатокутник не може існувати.");
        }
    }
}


