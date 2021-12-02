package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени
в секундах. Вывести данное значение длительности в часах, минутах и секундах в
следующей форме:ННч ММмин SSc. */

public class Task_5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input T:\n");
        int T = cs.nextInt();
        System.out.format("%dч %dмин %dс\n", T / 3600, (T % 3600) / 60, (T % 3600) % 60);
    }
}
