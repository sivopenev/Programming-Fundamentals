package _01_Basic_Syntax_Conditional_Statements_and_Loops_Lab;

import java.util.Scanner;

public class _10_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {

            int result = number * i;

            System.out.println(number + " X " + i + " = " + result);
        }
    }
}
