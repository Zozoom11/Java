package Algorithmization.Sortings;
import java.util.Arrays;
import java.util.Scanner;

/* Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором. */

public class Task_3 {

    public static void main(String[] args) {
        choiceSort(createArray());
    }

    public static void choiceSort(int[] arrayToSort){
        int indexMax;
        for (int i = 0; i < arrayToSort.length-1; i++) {
            indexMax = i;
            for (int j = i; j < arrayToSort.length; j++) {
                if (arrayToSort[indexMax] < arrayToSort[j]){
                    indexMax = j;
                }
            }
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[indexMax];
            arrayToSort[indexMax] = temp;
        }
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static int[] createArray(){
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int length = cs.nextInt();
        int[] unsortedArray = new int[length];
        System.out.print("Input number in array:\n");
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = cs.nextInt();
        }
        System.out.println(Arrays.toString(unsortedArray));
        return unsortedArray;
    }
}

