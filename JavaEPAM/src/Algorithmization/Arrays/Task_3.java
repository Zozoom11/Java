package Algorithmization.Arrays;
import java.util.Scanner;

/* Дан массив действительных чисел, размерность которого N. Подсчитать,
сколько в нем отрицательных, положительных и нулевых элементов. */

public class Task_3 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int length = cs.nextInt();
        int negative_numbers = 0;
        int positive_numbers = 0;
        int zero = 0;
        int[] array = new int[length];
        System.out.print("Input numbers in array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
                if (array[i] > 0){
                    positive_numbers += 1;
                }else if (array[i] == 0) {
                    zero += 1;
                }else{
                    negative_numbers += 1;
                }
        }
        System.out.format("Positive_numbers: %d \nNegative_numbers: %d \nZero: %d", positive_numbers, negative_numbers, zero);
    }

}
