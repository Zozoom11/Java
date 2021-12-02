package Basics_of_Software_code_development.Cycles;
import java.util.Scanner;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше
или равен заданному е. Общий член ряда имеет вид: a_n = 1/2^n + 1/3^n */

public class Task_5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input x:\n");
        double a;
        int n = 1;
        double e = cs.nextDouble();
        double sum = 0;
        do{
            a = (1/Math.pow(2, n))+(1/Math.pow(3, n));
            sum += a;
            n++;
        }while (Math.abs(a) >= e);
        System.out.println(sum);
    }
}
