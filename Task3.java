import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмір масиву: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(50); // 0–49
        }

        System.out.println("Початковий масив: " + Arrays.toString(arr));

        System.out.print("Яке число знайти? ");
        int find = sc.nextInt();

        System.out.print("На яке число замінити? ");
        int replace = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == find) {
                arr[i] = replace;
            }
        }

        System.out.println("Оновлений масив: " + Arrays.toString(arr));
    }
}