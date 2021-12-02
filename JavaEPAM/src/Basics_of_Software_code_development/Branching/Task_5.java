package Basics_of_Software_code_development.Branching;
import java.util.Scanner;

//Вычислить значение функции:x^2-3x+9 если x<=3, 1/(x^3+6) если x>3

public class Task_5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input x:\n");
        double x = cs.nextDouble();
        System.out.println(x > 3 ? 1 / (Math.pow(x, 3) + 6) : Math.pow(x, 2) - 3 * x + 9);
    }
}
