package Basics_of_Software_code_development.Branching;
import java.util.Scanner;

/* Даны два угла треугольника (в градусах). Определить,
существует ли такой треугольник, и если да, то будет ли он прямоугольным. */

public class Task_1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input a, b:\n");
        int x = cs.nextInt();
        int y = cs.nextInt();
        if (x + y < 180 && 180 - x - y == 90 || x==90 && x + y < 180 || y==90 && x + y < 180){
            System.out.print("Прямоугольный");
        }else if(x + y < 180){
            System.out.println("Существует");
        }else{
            System.out.println("Несуществует");
        }
    }
}
