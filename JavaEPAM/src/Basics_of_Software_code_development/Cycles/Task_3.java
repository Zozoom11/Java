package Basics_of_Software_code_development.Cycles;

//Найти сумму квадратов первых ста чисел.

public class Task_3 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += Math.pow(i, 2);
        System.out.println(sum);
    }
}
