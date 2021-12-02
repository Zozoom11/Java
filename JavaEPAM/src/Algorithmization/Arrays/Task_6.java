package Algorithmization.Arrays;
import java.util.Scanner;

/* Задана последовательность N вещественных чисел. Вычислить сумму чисел,
порядковые номера которых являются простыми числами. */

public class Task_6 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input array length:\n");
            int number = in.nextInt();
            int sum = 0;
            int[] array = new int[number];
            System.out.print("Input number in array:\n");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
                if (isPrime(i)){
                    sum += array[i];
                }
            }
            System.out.println(sum);
    }
}
