package Algorithmization.Arrays;
import java.util.Scanner;

/* Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены,
большие данного Z, этим числом. Подсчитать количество замен. */

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length and Z: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        int z = sc.nextInt();
        int sum = 0;
        System.out.print("Input an: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
                if (array[i] > z) {
                    array[i] = z;
                    sum += 1;
                }
        }
        System.out.println(sum);
    }
}
