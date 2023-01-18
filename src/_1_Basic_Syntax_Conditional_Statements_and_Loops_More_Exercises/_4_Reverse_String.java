package _1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercises;

import java.util.Scanner;

public class _4_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            char currentLetter = input.charAt(i);
            reversed += currentLetter;
        }
        System.out.println(reversed);


    }
}
