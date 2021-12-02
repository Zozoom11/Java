package Basics_of_Software_code_development.Branching;
import java.util.Scanner;

//Найти max{min(a, b), min(c, d)}

public class Task_2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input a, b, c, d:\n");
        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();
        int d = cs.nextInt();
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
