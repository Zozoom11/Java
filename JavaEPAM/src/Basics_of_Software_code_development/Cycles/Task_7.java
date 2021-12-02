package Basics_of_Software_code_development.Cycles;
import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n вывести все делители,
кроме единицы и самого числа. m и n вводятся с клавиатуры. */

public class Task_7 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input m, n:\n");
        int m = cs.nextInt();
        int n = cs.nextInt();
        for(int i = m; i <= n; i++)
            for (int j = 2; j < i; j++)
                if ((i % j) == 0) System.out.format("Делитель %d - %d\n", i, j);
    }
}
