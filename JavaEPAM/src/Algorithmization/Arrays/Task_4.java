package Algorithmization.Arrays;
import java.util.Scanner;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

public class Task_4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input array length:\n");
        int number = cs.nextInt();
        int max = 0;
        int min = 0;
        int[] array = new int[number];
        System.out.println("Input an in array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = cs.nextInt();
            if (array[i] > array[max]){
                max = i;
            }else if (array[i] < array[min]){
                min = i;
            }
        }
        int temp = array[max];
        array[max] = array[min];
        array[min] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
