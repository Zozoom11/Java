package Basics_of_Software_code_development.Cycles;
import java.util.Scanner;

/* Напишите программу, где пользователь вводит любое целое положительное число.
А программа суммирует все числа от 1 до введенного пользователем числа. */

public class Task_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = cs.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
        System.out.println(sum);
    }
}
