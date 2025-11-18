import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int size = 20; // можете изменить
        int[] arr = new int[size];

        Random random = new Random();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // 0–99
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Вывод массива
        System.out.println("Масив:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nПарних чисел: " + even);
        System.out.println("Непарних чисел: " + odd);
    }
}