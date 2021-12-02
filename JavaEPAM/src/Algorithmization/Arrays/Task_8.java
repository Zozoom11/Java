package Algorithmization.Arrays;
import java.util.Scanner;

/* Дана последовательность целых чисел a 1 , a 2 , ... , a n . Образовать новую последовательность,
выбросив из исходной те члены, которые равны min( a 1 , a 2 , ... , a n ) . */

public class Task_8 {
    public static void main (String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int num = cs.nextInt();
        int[] array = new int[num], b = new int[num];
        System.out.print("Input number in array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < num; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min){
                b[sum] = array[i];
                sum++;
            }
        }
        for (int i = 0; i < sum; i++) {
            System.out.print(b[i]);
        }
    }
}
