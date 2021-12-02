package Basics_of_Software_code_development.Branching;
import java.util.Scanner;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
Определить, пройдет ли кирпич через отверстие. */

public class Task_4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Sizes:\n");
        int a = cs.nextInt();
        int b = cs.nextInt();
        int x = cs.nextInt();
        int y = cs.nextInt();
        int z = cs.nextInt();
        System.out.println((a*b > x*y) && (a*b > y*z) && (a*b > z*x));
    }
}