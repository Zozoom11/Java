package Algorithmization.Arrays;
import java.util.Scanner;

/* Дан целочисленный массив с количеством элементов п. Сжать массив,
 выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 Примечание. Дополнительный массив не использовать. */

public class Task_10 {
    public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            System.out.print("Input array length:\n");
            int length = cs.nextInt();
            int[] array = new int[length];
            System.out.print("Input number in array:\n");
            for (int i = 0; i < length; i++) {
                array[i] = cs.nextInt();
            }
            for (int i = 0; i < array.length; i++) {
                if (length-2*i+2 > 2) {
                    array[i] = array[2*i];
                }else{
                    array[i] = 0;
                }
                System.out.print(array[i]);
            }
    }
}
