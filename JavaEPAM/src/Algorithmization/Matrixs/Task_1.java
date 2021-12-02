package Algorithmization.Matrixs;
import java.util.Scanner;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("length - array_1, array_2: ");
        int array_1 = cs.nextInt();
        int array_2 = cs.nextInt();
        int[][] arr = new int[array_1][array_2];
        System.out.println("Input numbers in arrays:\n");
        for (int i = 0; i < array_1; i++) {
            for (int j = 0; j < array_2; j++) {
                arr[i][j] = cs.nextInt();
            }
        }

        for (int i = 0; i < arr[0].length; i += 2) {
            if (arr[0][i] > arr[arr.length - 1][i]){
                System.out.println("Column #" + (i + 1));
                for (int j = 0; j < arr.length; j++) {
                    System.out.println(arr[j][i]);
                }
            }
        }
    }

}
