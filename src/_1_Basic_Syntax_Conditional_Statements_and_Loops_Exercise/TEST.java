package _1_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        for (int i = input.length() - 1; i >= 0; i--) {

            char symbol = input.charAt(i);
            System.out.print(symbol);
        }
    }

}
