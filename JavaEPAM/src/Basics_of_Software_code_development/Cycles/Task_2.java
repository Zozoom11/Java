package Basics_of_Software_code_development.Cycles;
import java.util.Scanner;

//Вычислить значение функции на отрезке [a,b] c шагом h: x, x>2 & -x, x<=2;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a, b, h:\n");
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        for (int x = a; x < b; x += h)
            System.out.format("x = %d, y = %d\n", x, x > 2 ? x : -x);
    }
}
