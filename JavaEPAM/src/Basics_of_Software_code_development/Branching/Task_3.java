package Basics_of_Software_code_development.Branching;
import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task_3{
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.print("Input:\n");
        double x1 = cs.nextDouble();
        double y1 = cs.nextDouble();
        double x2 = cs.nextDouble();
        double y2 = cs.nextDouble();
        double x3 = cs.nextDouble();
        double y3 = cs.nextDouble();
        if((y3-y1/y2-y1) == (x3 - x1/x2-x1))
            System.out.println("На одной прямой");
        else
            System.out.println("На разных прямых");

    }
}
