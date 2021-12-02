package Basics_of_Software_code_development.Linear_programs;
import java.util.Scanner;

/* Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у) принадлежит закрашенной области,
и false — в противном случае. */

public class Task_6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input x, y:\n");
        int x = cs.nextInt();
        int y = cs.nextInt();
        System.out.println(((x >= -2) && (x <= 2) && (y >= 0) && (y <= 4)) || ((x >= -4) && (x <= 4) && (y <= 0) && (y >= -3)));
    }
}