package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

/*  Вычислить значение выражения по формуле
(все переменные принимают действительные значения):
(b+sqrt(b^2+4*a*c))/(2*a) - a^3*c+ b^-2 */

public class Task_2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input a, b, c:\n");
        float a = cs.nextFloat();
        float b = cs.nextFloat();
        float c = cs.nextFloat();
        System.out.println(((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}
