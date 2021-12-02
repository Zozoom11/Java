package Algorithmization.Arrays;
import java.util.Scanner;

//Даны действительные числа a 1 , a 2 , a n . Найти max(a1 + a2n, a2 + a2n-1)

public class Task_7 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int length = cs.nextInt();
        int[] array = new int[length];
        System.out.print("Input number in array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
        }
        int max = 0;
        for (int i = 0; i <= length/2; i++) {
            if (array[i] + array[length-1-i] > max) {
                max = array[i] + array[length-1-i];
            }
        }
        System.out.println(max);
    }

}
