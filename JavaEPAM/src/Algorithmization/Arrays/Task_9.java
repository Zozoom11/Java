package Algorithmization.Arrays;
import java.util.Scanner;


/* В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 Если таких чисел несколько, то определить наименьшее из них. */

public class Task_9 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int length = cs.nextInt();
        int[] array = new int[length];
        System.out.print("Input number in array:\n");
        for (int i = 0; i < length; i++) {
            array[i] = cs.nextInt();
        }
        // Отсортируем массив по возрастанию
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Находим длину наибольшей последовательности повторяющихся чисел.
        int l = 1;
        for (int i = 1; i < length; i++) {
            if (array[i] == array[i - length]) {
                length++;
            }
        }

        // Найдём, какому именно числу соответствует последовательность.
        // Массив отсортирован, следовательно ответом будет наименьшее из возможных.
        int result = 0;
        for (int i = length - 1; i < args.length; i++) {
            if (array[i] == array[i - length + 1]) {
                result = array[i];
                break;
            }
        }
        System.out.println("result: " + result);
    }
}
