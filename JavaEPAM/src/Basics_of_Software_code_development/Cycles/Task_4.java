package Basics_of_Software_code_development.Cycles;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task_4 {
    public static void main(String[] args) {
        int num = 200;
        long sum = 1;
        for (int i = 1; i <= num; i++)
            sum *= Math.pow(i, 2);
        System.out.println(sum);

    }
}
