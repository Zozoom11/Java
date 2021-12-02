package Algorithmization.Arrays;
import java.util.Scanner;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task_5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int number = cs.nextInt();
        int[] array = new int[number];
        System.out.print("Input number in array:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i){
                System.out.print(array[i]);
            }
        }
    }

}
