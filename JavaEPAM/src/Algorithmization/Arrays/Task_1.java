package Algorithmization.Arrays;
import java.util.Scanner;

public class Task_1 {

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array length and K:\n");
        int length = sc.nextInt();
        int[] array = new int[length];
        int k = sc.nextInt();
        int sum = 0;
        System.out.print("Input [N]: ");
        for (int i = 0; i <= array.length; i++) {
            i = sc.nextInt();
                if (i % k == 0)
                    sum += i;
        }
        System.out.println(sum);
    }

}
