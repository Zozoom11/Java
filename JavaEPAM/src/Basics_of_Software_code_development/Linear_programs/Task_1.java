package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input a, b, c :\n");
        float a = cs.nextFloat();
        float b = cs.nextFloat();
        float c = cs.nextFloat();
        System.out.println(((a - 3) * b / 2) + c);
    }
}
