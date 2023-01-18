package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _9_Sum_of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < number * 2; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }

        System.out.println("Sum: " + sum);

    }
}
