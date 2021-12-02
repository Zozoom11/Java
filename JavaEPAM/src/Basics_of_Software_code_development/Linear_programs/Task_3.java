package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

/* Вычислить значение выражения по формуле
(все переменные принимают действительные значения):
((sinx + cosx)/(cosx-siny)) * tg(x*y) */

public class Task_3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input x, y:\n");
        float x = cs.nextFloat();
        float y = cs.nextFloat();
        System.out.println((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(x)) * Math.tan(x * y));
    }
}
