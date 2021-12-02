package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

/* Дано действительное число R вида nnn.ddd
(три цифровых разряда в дробной и целой частях). Поменять местами дробную и
целую части числа и вывести полученное значение числа. */

public class Task_4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input R:\n");
        double R = cs.nextDouble();
        System.out.println((1000*R - 1000*Math.floor(R)) + Math.floor(R)/1000);
    }
}